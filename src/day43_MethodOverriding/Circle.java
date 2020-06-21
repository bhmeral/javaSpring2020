package day43_MethodOverriding;

public class Circle extends  Shape {

    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println("Area of the circle : " + radius * radius * PI);
    }
    public void calculatePerimeter(){
        System.out.println("Perimeter of the circle: " + radius * 2 * PI);
    }

}
