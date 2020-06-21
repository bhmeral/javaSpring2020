package day46_final_abstract;

import java.text.DecimalFormat;

public class Rectangle extends Shape{

    public double width;
    public double length;


    @Override
    public void Area(){
        DecimalFormat dtf = new DecimalFormat("00.00");
        double area = width * length;
        System.out.println("Area of rectangle :" + dtf.format(area));
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(6.5,Math.log10(100));
        obj.Area();

    }
}
