package Repl_it;

import java.util.Scanner;

public class repl_it_80_Online_Book_Merchants_Scanner_Operators {
    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nBooksPurchased = scan.nextInt();

        if (isPremiumCustomer){
            if (nBooksPurchased>=5){
                freeBooks = 1;
            }
            if (nBooksPurchased>=8){
                freeBooks = 2;
            }
        }else{
            if (nBooksPurchased>=7){
                freeBooks = 1;
            }
            if (nBooksPurchased>=12){
                freeBooks = 2;
            }
        }

        System.out.println(freeBooks);


    }
}
