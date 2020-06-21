package day46_final_abstract;

import java.text.DecimalFormat;

public class Square extends Shape{

    double side;

    @Override
    public void Area(){
        DecimalFormat dft = new DecimalFormat("0.000");
        double area = side * side;
        System.out.println("Area of square is :" + dft.format(area));
    }

    public Square(double side){
        this.side = side;
    }


    public static void main(String[] args) {
        Square obj = new Square(4.59);
         obj.Area();
    }
}
