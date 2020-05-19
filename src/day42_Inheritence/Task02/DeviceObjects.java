package day42_Inheritence.Task02;

public class DeviceObjects {
    public static void main(String[] args) {

        Television tv1 = new Television("Samsung","E250",500,40);
        tv1.country = "Korea";
        System.out.println(tv1);

        Phone phone1 = new Phone("Samsung","Note 10",1100,"large");
        System.out.println(phone1);
    }
}
