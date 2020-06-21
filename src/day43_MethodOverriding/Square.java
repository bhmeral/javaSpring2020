package day43_MethodOverriding;

public class Square extends Shape {

    public double length;

    public Square(double length){
        this.length = length;
    }

    public void calculateArea(){
        System.out.println("Area of Square: " + length * length);
    }

    public  void calculatePerimeter(){
        System.out.println("Perimeter of Square: " + 4 * length);
    }
}
