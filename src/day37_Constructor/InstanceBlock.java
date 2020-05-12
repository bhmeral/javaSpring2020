package day37_Constructor;

public class InstanceBlock {

    static {
        System.out.println("static block");
    }


    {
        System.out.println("Instance Block");
    }


    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        InstanceBlock obj1 = new InstanceBlock();
    }

}
