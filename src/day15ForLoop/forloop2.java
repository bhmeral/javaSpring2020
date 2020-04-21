package day15ForLoop;

public class forloop2 {
    public static void main(String[] args) {
        String str = "java is fun";
        int lastIndexNum = str.length()-1;
        String reverse2 = "";
        for (int i= lastIndexNum; i>=0 ; i--){
            reverse2 += str.charAt(i);
        }

    }
}

