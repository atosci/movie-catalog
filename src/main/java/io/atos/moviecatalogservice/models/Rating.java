package io.atos.moviecatalogservice.models;

/**
 * @author Mohamed El Kawakibi
 * @author Puck School
 */
public class Rating {
    private String Source;
    private String Value;

    // default constructor
    public Rating() { }

    /**
     * @param source A String representing the source of the rating
     * @param value A String representing the value of the rating
     */
    public Rating(String source, String value) {
        Source = source;
        Value = value;
    }

    /** Gets the source of the rating
     * @return A String representing the rating source
     */
    public String getSource() {
        return Source;
    }

    /** Sets the source of the rating
     * @param source String representing the rating source
     */
    public void setSource(String source) {
        this.Source = source;
    }

    /** Gets the value of the rating
     * @return A String representing the rating value
     */
    public String getValue() {
        return Value;
    }

    /** Sets the value of the rating
     * @param value String representing the rating value
     */
    public void setValue(String value) {
        this.Value = value;
    }
}
