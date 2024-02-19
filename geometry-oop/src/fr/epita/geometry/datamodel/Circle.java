package fr.epita.geometry.datamodel;

public class Circle implements Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return Math.pow(this.getRadius(), 2) * Math.PI;
    }


}
