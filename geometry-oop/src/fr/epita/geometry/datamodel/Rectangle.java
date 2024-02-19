package fr.epita.geometry.datamodel;

public class Rectangle implements Shape{


    private  double height;
    private  double width;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }


    public double calculateArea() {
        return this.width * this.height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
