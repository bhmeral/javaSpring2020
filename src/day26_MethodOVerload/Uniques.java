package day26_MethodOVerload;

public class Uniques {


    public static void main(String[] args) {
        String str = "ABB";
        String result = "";

        for (int i=0; i< str.length(); i++){

            //A
            int num = frequency(str,str.charAt(i));
            if (num == 1){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static String uniques (String str){
        String result = "";

        for (int i=0; i< str.length(); i++){

            //A
            int num = frequency(str,str.charAt(i));
            if (num == 1){
                result += str.charAt(i);
            }
        }
        return  result;
    }


    public static int frequency (String str , char  ch){
        char [] arr = str.toCharArray(); // [A,A,A]
        int count = 0;
        for (char each : arr){
            if (each== ch){
                count++;
            }

        }
        return  count;
    }
}
