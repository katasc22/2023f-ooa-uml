package fr.epita.geometry.launcher;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Shape;
import fr.epita.geometry.datamodel.Square;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(3);

        Square square1 = new Square(5);
        Square square2 = new Square(5);
        Square square3 = new Square(5);

        List<Shape> shapes = Arrays.asList(circle1, circle2, circle3);

        shapes.addAll(Arrays.asList(square1, square2, square3));

        double totalArea = 0;
        for (int i = 0; i < shapes.size(); i++){
            totalArea += shapes.get(i).calculateArea();
        }




    }
}
