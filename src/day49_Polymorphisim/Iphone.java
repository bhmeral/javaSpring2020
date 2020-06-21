package day49_Polymorphisim;

public final class Iphone extends Phone implements AppleApps{

    static {
        brand = "Apple";
    }

    public Iphone(String model,double price,double size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting " +  phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling " + phoneNumber);
    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading apps from " + AppStoreName);
    }

    public void faceTiming(long  phoneNumber){
        System.out.println("Iphone is face-timing " + phoneNumber);
    }
}
