package day09_NestedIf_Turnetry;

public class ageGroups_NestedIf {
    public static void main(String[] args) {
        int age = 10;
        String ageGroup = " ";


        if (age>0 && age<150){
            if (age<21){
                ageGroup = " Teenager";
            }else if (age>=21 && age<55){
                ageGroup = "Adult";
            }else if (age>55){
                ageGroup = "Senior";
            }

        }else{
            ageGroup = "Invalid Entry";
        }

        System.out.println(ageGroup);



    }
}
