package day23_Methods;

public class Methods {

    /*
    Access-modifier specifier return-type methodName(){
                    statements;
            }
            step1: "Hello Cybertek"
            step2: "Hello World 5 times"
            step3: "Hello Batch18
            step4:  Hello World 5 times
            step5:  Hello Saim
            step6:  Hello World 5 times

     */

    public static void main(String[] args){
        printHello5Times();
        System.out.println();
        Hello();
        System.out.println();
        evenNumber1_100();
        System.out.println();
        oddNumber1_100();
    }

    public static void printHello5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("HelloWorld");
        }

    }

    public  static void Hello(){
        System.out.println("Hello Batch 18");
        System.out.println("Hello Muhtar");
        System.out.println("Hello Cybertek");
    }

    public static void evenNumber1_100(){
        int i=1;
        while(i<=100){
            if (i%2==0){
                System.out.print("Even number:" + i + " ");
            }
          i++;
        }

    }

    public static void oddNumber1_100(){
        int i=1;
        while(i<=100){
            if (i%2!=0){
                System.out.print("Odd number:" + i + " ");
            }

            i++;
        }
    }


}
