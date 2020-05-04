package day33_CustomClass;

public class BankAccount {

    String accountHolder;
    int accountNumber;
    int  Balance;

    public void checkingBalance(){
        System.out.println("Available Balance:" + Balance + "$");
    }
    public void withDraw(int WD_amount){
        System.out.println("You withdraw " + WD_amount + "$" + " and the current balance of your account is " + (Balance-WD_amount)+ "$");
        Balance -= WD_amount;
    }
    public void deposit (int DP_amount ){
        System.out.println("You deposit " + DP_amount + "$" + " and the current balance of your account is " + (Balance+DP_amount) + "$" );
        Balance += DP_amount;
    }
    public void setBankAccountInfo(String p_accountHolder,int p_accountNumber,int p_Balance){
        accountNumber = p_accountNumber;
        accountHolder = p_accountHolder;
        Balance = p_Balance;
    }

    public String toString(){
        String result = "Account Holder:" + accountHolder + " Account Number:" +  accountNumber + " Balance:" + Balance + "$";

                return result;
    }
}
