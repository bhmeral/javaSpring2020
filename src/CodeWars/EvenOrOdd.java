package CodeWars;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        String result = "";
    if(number%2==0){
        result = "Even Number";
    }else{
       result = "Odd Number";
    }

    return result;
}

    public static void main(String[] args){
        String result = even_or_odd(13);
        System.out.println(result);
    }
}

