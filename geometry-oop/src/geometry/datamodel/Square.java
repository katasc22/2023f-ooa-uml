package geometry.datamodel;

public class Square implements Shape{

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

    public double calculateArea(){
        return this.side*this.side;
    }

    public double calculatePerimeter(){
        return 4*this.side;
    }

}
