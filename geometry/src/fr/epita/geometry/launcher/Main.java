package fr.epita.geometry.launcher;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Square;
import fr.epita.geometry.datamodel.Triangle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(20);
        Square square = new Square(230);
        Triangle triangle = new Triangle(33,33,33,33);

        System.out.println("Circle perimeter : " + circle.getPerimeter() + "\nCircle area: "+ circle.getArea());
        System.out.println("Square perimeter : " + square.getPerimeter() + "\nSquare area: "+ square.getArea());
        System.out.println("Triangle perimeter : " + triangle.getPerimeter() + "\nTriangle area: "+ triangle.getArea());

    }
}
