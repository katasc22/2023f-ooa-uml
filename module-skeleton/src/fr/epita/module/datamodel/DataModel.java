package fr.epita.module.datamodel;

import java.time.LocalDate;

public class DataModel {

    private String attributeString;
    private int attributeInt;
    private LocalDate attributeDate;

    public DataModel() {
    }

    public DataModel(String attributeString, int attributeInt, LocalDate attributeDate) {
        this.attributeString = attributeString;
        this.attributeInt = attributeInt;
        this.attributeDate = attributeDate;
    }

    public String getAttributeString() {
        return attributeString;
    }

    public void setAttributeString(String attributeString) {
        this.attributeString = attributeString;
    }

    public int getAttributeInt() {
        return attributeInt;
    }

    public void setAttributeInt(int attributeInt) {
        this.attributeInt = attributeInt;
    }

    public LocalDate getAttributeDate() {
        return attributeDate;
    }

    public void setAttributeDate(LocalDate attributeDate) {
        this.attributeDate = attributeDate;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "attributeString='" + attributeString + '\'' +
                ", attributeInt=" + attributeInt +
                ", attributeDate=" + attributeDate +
                '}';
    }
}
