package fr.epita.geometry.datamodel;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
