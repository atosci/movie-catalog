package io.atos.moviecatalogservice.models;

public class Rating {
    private String Source;
    private String Value;

    // default constructor
    public Rating() { }

    public Rating(String source, String value) {
        Source = source;
        Value = value;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        this.Source = source;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        this.Value = value;
    }
}
