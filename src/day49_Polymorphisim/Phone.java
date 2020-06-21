package day49_Polymorphisim;

interface downloadable {
    boolean downloadable = true; // public static final

    void download(); // public abstract
}

interface AndroidApps extends downloadable { // 2 variable , 1 abstract method
    String AppStoreName = "Google Play Store"; // public static final
}

interface AppleApps extends downloadable { // 2 variable , 1 abstract method
    String AppStoreName = "App Store"; // public static final
}



public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public double size;



    public abstract void texting(long phoneNumber);

    public abstract void calling(long phoneNumber);

    @Override
    public String toString() {
        return "Brand " + brand +
                " Model " + model +
                ", Price " + price +
                ", Size " + size +
                '}';
    }
}
