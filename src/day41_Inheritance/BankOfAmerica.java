package day41_Inheritance;

public class BankOfAmerica {
    public static void main(String[] args) {


        BankAccount Irina = new BankAccount("Irina","Li");

        System.out.println(Irina.getAccountHolder());
        System.out.println(Irina.getBalance());
        Irina.checkBalance();
        Irina.depositing(100);
        Irina.checkBalance();

    }
}
