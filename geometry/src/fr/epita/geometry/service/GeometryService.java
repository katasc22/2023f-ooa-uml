package fr.epita.geometry.service;

import fr.epita.geometry.datamodel.Circle;

public class GeometryService {

    public static double getArea(Circle circle) {
        return Math.pow(circle.getRadius(), 2) * Math.PI;
    }



}
