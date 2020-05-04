package day33_CustomClass;

public class carObjects {
    public static void main(String[] args) {
      Car car1 = new Car();

        car1.Brand = "BMW";
        car1.color = "Yellow";
        car1.model = "M3";
        car1.year = 2020;

        System.out.println(car1.Brand);
        System.out.println(car1.color);
        System.out.println(car1.model);
        System.out.println(car1.year);

        car1.start();
        car1.drive();
        car1.getCarInfo();

      System.out.println("=====================");

        Car car2 = new Car();

        car2.year = 2020;
        car2.model = "Corolla";
        car2.Brand = "Toyota";
        car2.color = "Yellow";
        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        car2.start();
        car2.drive();
        car2.getCarInfo();

      System.out.println("======================");

      Car car3 = new Car();
          car3.Brand = "Mercedes";
          car3.model =  "A45";
          car3.color = "Yellow";

      car3.getCarInfo();
      car3.start();
      car3.drive();

      System.out.println("======================");

      String str = "A";
      String str1 = "B";

      String [] arr = {str,str1};

      Car[] cars = {car1,car2,car3};

      cars[0].getCarInfo();
      cars[1].getCarInfo();
      cars[2].getCarInfo();

      
    }
}
