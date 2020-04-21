package pratik;

public class warmuptask {
    public static void main(String[] args) {

        int year = 1926;
        boolean leapyear = year%4 == 0;
        System.out.println(  year +" is leap year: " +  leapyear);







        System.out.println("65 is divisible by 2: " + (65%2 ==0));
        System.out.println("65 is divisible by 3: "+ (65%3 ==0));
        System.out.println("65 is divisible by 5: "+ (65%5 ==0));


        int number = 6;

        boolean divisibleby2 = number%2 ==0;
        boolean divisibleby3 = number%3 ==0;
        boolean divisibleby5 = number%5 ==0;
        System.out.println( number + " is divisible by: "+ divisibleby2);
        System.out.println( number + " is divisible by:"+ divisibleby3);
        System.out.println( number + " is divisible by:"+ divisibleby5);




    }
}
