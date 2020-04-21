package day06_Shorthnd_LogicalOperators;

public class shorthandoperators {
    public static void main(String[] args) {
        int x = 20;
        x += 10; // x = x + 10

        System.out.println(x);


            x +=60; // x


            String schoolname = "CyberTek";
                    schoolname += 12345;  // schoolname = schoolname + 12345
        System.out.println(schoolname);


        System.out.println('a'+ 'b');
        //                  97 + 98 ==> 195

        char ch1 = 'a';     //97
             ch1 += 'b';    //98
        System.out.println(ch1);
        // char ch1 = 195;      output will be character

        int num = 'z';  //num = 122
            num += 'x'; //num = num + 120;
                        //num = 242
        System.out.println(num);

        int  A = 100;
             A -= 90;
        System.out.println(A);

        int B = 200;
            B -=A;  // B = B - A
        System.out.println(B);

        int C = 100;
            C *=5;
        System.out.println(C);
        int  D = C*=10;
        System.out.println(D);
        System.out.println(C);

        int a1 = 100; //200,201
        int b1 = (a1*=2) + ++a1;
        // b1 = 200  + 201
        // b1 = 401
        System.out.println(b1);


        int x1 = 10;
        int y = x1 += 10*2; // x1 = x1 + 20
        System.out.println(y);



        int q = 20;
        int p = q*=20*3;
        System.out.println(p);


        int num1 = 300;
        num1 /=2;
        System.out.println(num1);

        int num2 = 400;
            num2 /= 20 + 10;  // num2 = num2 / 30
                              // num2 = 400  / 30 13.123
                             // num2 =  13


            int num3 = 300;
                num3 %= 10 + 20; // output will be 0
        System.out.println(num3);
    }

}
