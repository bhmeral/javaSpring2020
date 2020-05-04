package day33_CustomClass;

public class BankAccountObjects {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.setBankAccountInfo("Rüstem",8979839,50000);

        System.out.println(account1);
        account1.checkingBalance();
        account1.deposit(1000);
        account1.withDraw(1000);
    }
}
