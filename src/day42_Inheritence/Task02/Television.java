package day42_Inheritence.Task02;

public class Television extends Device {
    /*
    brand Inherited
    model Inherited
    price Inherited
    country Inherited
    type    Inherited
    Size    Inherited
    watch();
    toString  Inherited

     */

    public Television(String brand, String model, int price, double size) {
        setDevice(brand, model, price, "TV", size);
    }

    public void watch() {
        System.out.println("watching " + brand + " TV");
    }


}
