package day43_MethodOverriding;

import com.sun.org.apache.regexp.internal.RE;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        System.out.println(circle1.radius);

        circle1.calculateArea(); // bug
        circle1.calculatePerimeter(); // bug

        System.out.println("===================================");

        Rectangle rectangle1 = new Rectangle(3,4);
        System.out.println(rectangle1.length);
        System.out.println(rectangle1.width);

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println("===================================");

        Square square1 = new Square(2);
        System.out.println(square1.length);

        square1.calculateArea();
        square1.calculatePerimeter();


    }
}
