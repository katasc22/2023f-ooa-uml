package geometry.launcher;


import geometry.datamodel.Circle;
import geometry.datamodel.Shape;
import geometry.datamodel.Square;
import geometry.datamodel.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(234));
        shapes.add(new Circle(115));
        shapes.add(new Circle(30));
        shapes.add(new Square(500));
        shapes.add(new Square(120));
        shapes.add(new Square(20));
        shapes.add(new Triangle(23,45,12,44));
        shapes.add(new Triangle(100,4,22,77));
        shapes.add(new Triangle(10,20,30,40));

        double overallArea = 0;
        for (Shape shape : shapes) {
            overallArea += shape.calculateArea();
        }
        System.out.println("Overall area: "+overallArea);

    }
}
