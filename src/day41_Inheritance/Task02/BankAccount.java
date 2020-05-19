package day41_Inheritance.Task02;

public class BankAccount {

    public long accountNumber;
    public String accountHolder;
    public double balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void showBalance() {
        System.out.println("Avaliable: " + balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                " accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
