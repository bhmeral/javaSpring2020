package day10_Switch_Scanner.day10_warmuptask;

public class DaysInMonths {
    public static void main(String[] args) {
        int month = 14;
        boolean days28 = month==2;
        boolean days30 = month==4 ||month==6 || month==9 || month==11;
        String result = "";



        if(month>0 && month <13){
            result = (days28)?"Month has 28 days": (days30)?"Month has 30 days"
                    : "Month has 31 days";

        }else{
            result =   "Invalid";
        }
        System.out.println(result);

























    }
}
