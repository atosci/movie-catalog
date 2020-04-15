pipeline {

    agent any

    stages {
        stage('Maven unit test') {
            steps {
                 echo "current build number: ${currentBuild.number}"
                 sh 'mvn -Dmaven.test.failure.ignore=true install'
                 sh 'mvn compile'
                 sh 'mvn test'
            }
        }
    }
}

