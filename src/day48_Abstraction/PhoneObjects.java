package day48_Abstraction;

public class PhoneObjects {

    public static void main(String[] args) {
        iPhone phone = new iPhone("XS Max ",1200,"6.2");
        phone.calling(987562);
        phone.texting(523454);
        phone.FaceTiming(435123);
        System.out.println(phone);

        System.out.println("==========================================================");
        Samsung samsung = new Samsung("Note 10",1000,"6.5");
        System.out.println(samsung);
    }




}
