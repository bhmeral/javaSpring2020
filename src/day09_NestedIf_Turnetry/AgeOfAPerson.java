package day09_NestedIf_Turnetry;

public class AgeOfAPerson {
    public static void main(String[] args) {
        byte age = 0;

        String result = " ";

        if (age<1  && age >0){
            result = "This person is baby";
        } else if (age>=3 && age<=5){
            result = "This person is toddler";
        } else if (age>=6 && age<=9){
            result = "This person is kid";
        } else if (age>=10 && age<=12){
            result = "This person is pre-teen";
        } else if (age>=13 && age<=17){
            result = "This person is teenager";
        } else if (age>=18 && age<=20){
            result = "This person is young adult ";
        } else if (age>=21 && age<=39){
            result = "This person is adult";
        } else if (age>=40 && age<=49){
            result = "This person young middle age adult";
        } else if (age >= 50 && age <= 54) {
            result = "This person is Boomer";
        } else if ( age==0 || age>55){
            result = "Invalid Entry";
        }


        System.out.println(result);

        boolean eligibleToBuy =  age>=21 && age<=64;

        if (eligibleToBuy){
            System.out.println("You are eligible to buy liquor.");
        } else if (!(eligibleToBuy)){
            System.out.println("You are not eligible to buy liquor.");
        } else{
            System.out.println("Get out of here!.");
        }



    }
}
