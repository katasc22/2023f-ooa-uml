package geometry.datamodel;

public class Triangle implements Shape {

    private double sideA;
    private double sideB;
    private double height;
    private double base;

    public Triangle(double a, double b, double h, double base) {
        this.sideA = a;
        this.sideB = b;
        this.height = h;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea(){
        return (this.base*this.height) / 2;
    }

    public double calculatePerimeter(){
        return this.sideA + this.sideB + this.base;
    }
}
