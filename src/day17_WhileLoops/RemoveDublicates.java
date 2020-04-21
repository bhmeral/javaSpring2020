package day17_WhileLoops;

public class RemoveDublicates {
    public static void main(String[] args) {
            String str = "Java Java Java Java Java Java Java Java Java Java Java";



            int count = 0;  // +1+1

            while(str.contains("Java")){
                count++;
                str = str.replaceFirst("Java", ""); // after counting the first "java", we need to remove it from
            }

        System.out.println(count);
    }
}
