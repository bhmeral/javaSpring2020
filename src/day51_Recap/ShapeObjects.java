package day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(4.3);
        Circle circle1 = new Circle(4);
        Cylinder cylinder = new Cylinder(3,5.4);
        Cylinder cylinder1 = new Cylinder(5 ,12);

        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.addAll(Arrays.asList(circle,circle1,cylinder,cylinder1));

        for( Shape eachShape : shapeList){
            System.out.println(eachShape.name + " area : " + eachShape.calculatePerimeter() );
            System.out.println(eachShape.name + " perimeter : " + eachShape.calculateArea());
        }
    }
}
