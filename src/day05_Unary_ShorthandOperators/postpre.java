package day05_Unary_ShorthandOperators;

public class postpre {
    public static void main(String[] args) {

        // pre: changes the value of tge variable immediately
        int a= 100;
        System.out.println(++a); //101
        System.out.println(a); // 101

        int b = 100;
        System.out.println( --b); //99
        System.out.println(b); //99


        // Post:first passed the current value, then eventually changes the variable value
        int A = 100;
        System.out.println(A++);
        System.out.println(A);

        int B = 100;
        System.out.println(B--); //100
        System.out.println(B);   //99

        // post & pre examples:
        int z = 10;
        int x = ++z;

        System.out.println(z);
        System.out.println(x);

        int s = 10;
        int f = s++; // 10 , after line 34, the value of s will be increased by 1

        System.out.println(f);
        System.out.println(s);

        double t1 = 3.5;
        double t2 = t1--; // 3.5, after line 41 t1 will be  decreased by 1

        System.out.println(t2); //3.5
        System.out.println(t1); //2.5

        int num = 25;
        System.out.println(num++);  //26, after line 45 the value of num will be 26
        System.out.println(num--);  //25, after line 47 the value of num will be 25


        int t = 50; // 50
        t = --t + t++ + t-- + t++;
           // 49 + 49 + 50 + 49 = 150
        System.out.println(t);



        int x1 = 4;
        int y = x1*4 - x1++;
        System.out.println(y);

        int x2 = 1; // 0 , 1, 0 
        x2 = -x2-- + x2++ / -x2-- * --x2; // -1
        //   -1    +  0   /  -1   * -1

        System.out.println(x2);


















    }
}
