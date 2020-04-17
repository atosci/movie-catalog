pipeline {
    environment {
        registry = "atosci/moviecatalog"
        registryCredential = 'dockerhub_atosci'
    }
    agent any
    tools {
        maven 'Maven'
        jdk 'jdk8'
    }
    stages {
        stage('Maven unit test') {
            steps {
                 echo "current build number: ${currentBuild.number}"
                 sh 'mvn -Dmaven.test.failure.ignore=true install'
                 sh 'mvn compile'
                 sh 'mvn test'
            }
        }
        stage('Sonarqube analysis') {
            environment {
                    scannerHome = tool 'SonarQube Scanner'
            }
            steps {
                withSonarQubeEnv('Sonarqube Service') {
                    sh 'mvn clean package sonar:sonar'
                }
                timeout(time: 10, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        stage("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
                    // true = set pipeline to UNSTABLE, false = don't
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        
        
        stage('Building and Pushing docker image') {
            environment{
                dockerHome = tool 'docker'
            }
            steps {
                script {
                        docker.withRegistry('', registryCredential) {
                        def dockerImage = docker.build registry + ":$BUILD_NUMBER"
                        dockerImage.push()
                        dockerImage.push('latest')
                        sh "docker rmi $registry:$BUILD_NUMBER"
                    }
                }
            }
        }
        stage("Deploy on k8s") {
            steps {
                input ('Do you want to proceed?')
                withKubeConfig([credentialsId: 'Kubeconfig_file', serverUrl: 'https://kubeclustercontinuousintegration-dns-c66cbf56.hcp.westeurope.azmk8s.io:443']){
                    sh 'kubectl apply -f ${JOB_NAME}_deploy.yaml -n ${GIT_BRANCH}'
                    sh 'kubectl apply -f ${JOB_NAME}_service.yaml -n ${GIT_BRANCH}'
                  }
            }
        }
    }
}

