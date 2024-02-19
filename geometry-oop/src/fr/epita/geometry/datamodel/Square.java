package fr.epita.geometry.datamodel;

public class Square implements Shape{


    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }


    public double calculateArea() {
        return Math.pow(this.side, 2);
    }
}
