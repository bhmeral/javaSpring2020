package day07_IfStatements;

public class eligibletovote {
    public static void main(String[] args) {

        int age = 18;
        boolean uscitizen = false;
        boolean likeDonald = true;



        if(age>=18 && uscitizen==true && likeDonald== true){
            System.out.println("You are eligible to vote for Donald Trump");
        }
        if(!(age>=18 && uscitizen==true && likeDonald== true)){
            System.out.println("You are not eligible to vote for Donald Trump");
        }



    }
}
