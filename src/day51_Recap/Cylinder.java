package day51_Recap;

public class Cylinder extends Shape implements PI , Volume {


    public double radius;
    public double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        name = "Cylinder";
    }



    @Override
    public double calculateArea() {
        return height * (2 * PI * radius) + ( 2 * PI *  radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return (2 * height) + (4 * PI  * radius);
    }

    @Override
    public double calculateVolume() {
       return PI * radius * radius * height;
    }
}
