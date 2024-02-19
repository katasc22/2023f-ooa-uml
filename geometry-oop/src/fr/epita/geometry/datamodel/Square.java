package fr.epita.geometry.datamodel;

public class Square implements Shape{


    private Rectangle rectangle;

    public double getSide() {
        return rectangle.getWidth();
    }

    public void setSide(double side) {
        this.rectangle.setWidth(side);
        this.rectangle.setHeight(side);
    }

    public Square(double side) {
        this.rectangle = new Rectangle(side, side);
    }

    @Override
    public double calculateArea() {
        return rectangle.calculateArea();
    }
}
