package fr.epita.geometry.datamodel;

public class Square {

    private double side;
    public Square(double side) {
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return 4*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}
