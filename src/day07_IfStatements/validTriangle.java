package day07_IfStatements;

public class validTriangle {
    public static void main(String[] args) {

        double angle1 = 30;
        double angle2 = 50;
        double angle3 = 100;


        short sumOfAngles = (short)(angle1 + angle2 + angle3);

        boolean validtriangle = sumOfAngles == 180;

        if(validtriangle) {
            System.out.println("The shape is a triangle");
        }
        if(!validtriangle) {
            System.out.println("The shape is not a variable triangle");
        }








    }
}
