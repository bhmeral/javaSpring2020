package day42_Inheritence.Task02;

public class Phone extends Device{

    public Phone(String brand,String model,double price,String size){
        setDevice(brand,model,price, type = "SmartPhone", 6.9);
    }
    public void call(long number){
        System.out.println("Calling the number " + number);
    }
    public void text(long number){
        System.out.println("Texting to " + number);
    }

}
