package geometry.service;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Square;
import fr.epita.geometry.datamodel.Triangle;

public class GeometryService {

    public double getCircleArea(Circle c){
        return Math.pow(c.getRadius(),2)*Math.PI;
    }

    public double getCirclePerimeter(Circle c){
        return 2*c.getRadius()*Math.PI;
    }

    public double getTriangleArea(Triangle t){
        return (t.getBase()*t.getHeight()) / 2;
    }

    public double getTrianglePerimeter(Triangle t){
        return t.getSideA() + t.getSideB() + t.getBase();
    }

    public double getArea(Square s){
        return s.getSide()*s.getSide();
    }

    public double getPerimeter(Square s){
        return 4*s.getSide();
    }
}
