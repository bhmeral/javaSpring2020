package day49_Polymorphisim;

public class IphoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone X",1000,6.2);
        System.out.println(iphone);
        iphone.calling(911);
        iphone.texting(911);
        iphone.faceTiming(911);
        iphone.download();
    }
}
