package day09_NestedIf_Turnetry;

public class TernaryPractice {
    public static void main(String[] args) {

        int number = 100;

        char ch1 = (number>0)? '+' : '-';
        System.out.println(ch1);
        System.out.println("=======================================================");

        int score = 80;

        char grade = (score<=100 && score>=90)? 'A' : (score>=80 && score<=89)? 'B'
                : (score>=70 && score<=79)? 'C' : 'F';

        System.out.println(grade);








    }
}
