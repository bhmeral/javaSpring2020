package day18NestedLoop;

public class do_while_Practice {
    public static void main(String[] args) {


        int num = 0;

        do {
            if(num % 2 !=0){
                System.out.print(num+" ");
            }
                 num++;
        }while (num<=100);

        System.out.println("====================================");


        int i = 1;
        do {
            i++;
            System.out.print(i);
        }while(i<=5);
        System.out.println();

        System.out.println("==========================================");

        int z=1;
        do {
            System.out.print(z+" ");
           if(z == 2){
               break;
           }
            z++;
        }while(z<=5);
        System.out.println();

        System.out.println("==========================================");


        int y = 1;
        do {
            if(y==3){
                y++; // need to make sure that the iterator is not skipping, so that the condition will eventually be false
                continue;
            }

            System.out.print(y+" ");

            y++;
        }while (y<=5);

        System.out.println();
        System.out.println("==========================================");


        int t = 1;
        do {

            if (t%2 !=0){
                t++;
                continue;
            }

            System.out.print(t+" ");

            t++;
        }while (t<=100);














    }


}
