package day42_Inheritence;

public class AccessModifiers {

    public static String publicVariable = "public";
    protected static String protectedVariable = "protected";
   static String defaultVariable = "default";
    private String privateVariable = "private";


    public static void publicMethod() {
    }

    protected static void protectedMethod() {
    }

    static void defaultMethod(){
    }

    private static void privateMethods() {
    }

}

    class TestData2 extends  AccessModifiers {
        public static void main(String[] args) {
            System.out.println(TestData2.publicVariable);
            System.out.println(TestData2.protectedVariable);
            System.out.println(TestData2.defaultVariable);

            publicMethod();
            TestData2.protectedMethod();
            TestData2.defaultMethod();
        }
    }
