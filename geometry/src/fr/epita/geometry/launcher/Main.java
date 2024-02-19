package fr.epita.geometry.launcher;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.service.GeometryService;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(4);

        List<Circle> circles = Arrays.asList(circle1, circle2, circle3);
        double globalArea = 0.0;
        for (int i = 0; i < circles.size(); i++) {
            globalArea += GeometryService.getArea(circles.get(i));
        }

        circles.stream()
                .mapToDouble(GeometryService::getArea)
                .sum();



    }


}
