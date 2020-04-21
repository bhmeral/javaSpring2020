package day25_MethodsRecap;

public class WarmUp_Frequency {
    public static void main(String[] args) {
        String str = "ABAB";
        String result = RemoveDuplicates(str);
        System.out.println(result);


    }

    public static String RemoveDuplicates(String str){
        String result = "";
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){
                result += ch;
            }

        }
        return result;
    }

}
