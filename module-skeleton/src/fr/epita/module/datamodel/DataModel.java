package fr.epita.module.datamodel;

public class DataModel {

    private String attribute;

    public DataModel(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
