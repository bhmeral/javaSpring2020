package day42_Inheritence.Task02;

public class Device {

    public String brand;
    public String model;
    public double price;
    public static String country = "China";
    public String type;
    public double size;

    public String toString(){
        return "Brand: " + brand + ", Model:" + model + ", Price: " + ", Made In: " + country + ", Type: " + type;
    }

    public void setDevice(String brand,String model,double price,String type,double size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.type = type;
        this.size = size;
    }

}
