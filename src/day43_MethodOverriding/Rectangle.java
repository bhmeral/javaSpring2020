package day43_MethodOverriding;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void calculateArea(){
        System.out.println("Area of Rectangle: " + length * width);
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter of Rectangle: " + 2 *(length + width));
    }

}
