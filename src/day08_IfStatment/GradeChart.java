package day08_IfStatment;

public class GradeChart {
    public static void main(String[] args) {
        double grade = 10;

        if (grade<=100 && grade>=90 ){
            System.out.println("A");
        } else if ( grade<90 && grade>=80){
            System.out.println("B");
        }
          else if (grade<80 && grade>=70){
            System.out.println("C");
        }
          else if (grade<70 && grade>=60){
            System.out.println("D");
        }
          else{
            System.out.println("F");
        }


        System.out.println("================================================================");

             char note = ' ';

        if (grade<=100 && grade>=90 ){
                    note = 'A';
        } else if ( grade<90 && grade>=80){
                    note = 'B';
        }
        else if (grade<80 && grade>=70){
                    note = 'C';
        }
        else if (grade<70 && grade>=60){
                    note = 'D';
        }
        else{
                    note = 'F';
        }

        System.out.println(note);













































    }
}
