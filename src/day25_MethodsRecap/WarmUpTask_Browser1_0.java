package day25_MethodsRecap;

public class WarmUpTask_Browser1_0 {

    public static String getDriver2(String browserName){
        String result = "";
        if (browserName.equalsIgnoreCase("chrome")){
            return  "Chrome Driver";
        }else if (browserName.equalsIgnoreCase("safari")){
           return  "Safari Driver";
        }else if (browserName.equalsIgnoreCase("opera")){
            return  "Opera Driver";
        }else if (browserName.equalsIgnoreCase("firefox")){
           return  "Firefox Driver";
        }else{
            return  "Invalid Driver";
        }

    }

    public static String getDriver3(String browserName){
       browserName = browserName.toLowerCase();
        return (browserName.equals("chrome"))? "Chrome Driver":
                (browserName.equals("firefox"))? "Firefox Driver":
                        (browserName.equals("safari"))? "Safari Driver":
                                (browserName.equals("edge"))? "Edge":
                "Invalid Driver";
       
    }



    public static void main(String[] args) {
        String str = getDriver2("chrome");
        System.out.println(str);
        String str2 = getDriver3("safari");
        System.out.println(str2);
    }
}
