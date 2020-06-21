package day51_Recap;

public final class Circle extends Shape implements PI {

    public double radius;


    public Circle(double radius) {
        this.radius = radius;
        name = "Circle";
    }

   

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
