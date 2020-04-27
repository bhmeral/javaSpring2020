package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse(String str){
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }
    public static String RemoveDuplicates(String str){
        String result =  "";      //AB

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }

        }

        return result;
    }
    public static int Frequency(String str1, String str2){
        int count = 0 ;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        return count;
    }
    public static String FrequencyOfChars(String str){
        String NonDup = Library.RemoveDuplicates(str);   //ABC
        String result = "";
        for (int i=0; i<NonDup.length(); i++){
            String ch = "" + NonDup.charAt(i);
            int num = Library.Frequency(str,ch);
            //  System.out.println(ch+num);
            result += ch+num;
        }
        return result ;
    }
    public static int max(ArrayList<Integer> numbers){

        Integer max = Integer.MIN_VALUE;

        for (Integer each : numbers){
            if (each>max) {
                max = each;
            }
        }
        return max;
    }
    public static int min(ArrayList<Integer> numbers){
        Integer min = Integer.MAX_VALUE;

        for (Integer each : numbers){
            if (each<min){
                min = each;

            }
        }
        return min;
    }

}


