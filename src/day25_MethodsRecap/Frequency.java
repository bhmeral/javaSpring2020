package day25_MethodsRecap;

public class Frequency {
    public static void main(String[] args) {
        String str1 = "AAA";
        String str2 = "A";
        int count = 0;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2,"");
        }
      //  System.out.println(count);


        String a = "AABBBCDEFAA";
        String b = "A";
        int result    =    Frequency(a,b);
        System.out.println(result);
    }


    public static int Frequency(String str1,String str2){
        int count = 0;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2,"");
        }
        return count;
    }
}
