package day09_NestedIf_Turnetry;

public class Nested_If {
    public static void main(String[] args) {

        boolean UScitizen = false;
        int age = 16;

        if(UScitizen){
            if(age>17){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You MUST be 18 older to be able to vote");
            }

        }else{
            System.out.println("Only the US citizens are eligible to vote Donald Trump");
        }

        System.out.println("======================================================");

        int score =  0;
        String grade = " ";
        if(score>=0 && score<=100){

            if (score >= 90){
                grade = "A";
            }else if (score >=80){
                grade = "B";

            }else if (score >=70){
                grade = "C";
            }else if (score >=60){
                grade = "D";
            }else if (score <=50){
                grade = "F";
            }

        }else{
            grade = "Indvalid";
        }
        System.out.println("=================================================");


        System.out.println(grade);

       int score2 = 90;
        String grade2 = "";
            if(score2>=0 && score2<=100){

                grade2=(score2>=90)? "A":
                            (score2>=80)? "B":
                                  (score2>=70)? "C":
                                        (score2>=60)? "D":
                                                         "F";
            }else{
                grade2 = " Invalid Entry";
            }
        System.out.println(grade2);










    }
}
