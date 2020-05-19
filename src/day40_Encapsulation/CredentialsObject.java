package day40_Encapsulation;

public class CredentialsObject {
    public static void main(String[] args) {
        Credentials facebook = new Credentials();
        facebook.setPassWord("amca");
        facebook.setUserName("baba");
        System.out.println(facebook);

        Credentials amazon = new Credentials();
        amazon.setPassWord("hop");
        amazon.setUserName("amca");
        System.out.println(amazon);
    }
}
