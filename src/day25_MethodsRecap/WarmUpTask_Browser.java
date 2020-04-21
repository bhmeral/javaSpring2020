package day25_MethodsRecap;

import java.util.Scanner;

public class WarmUpTask_Browser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String browser = scan.next();
        String  result = getDriver2(browser);

    }
/*
    public static  String getDriver1(String browser){

        switch (browser.toLowerCase()){
            case "chrome" :
                System.out.println("Chrome Driver");
                break;
            case "fireFox" :
                System.out.println("Firefox Driver");
                break;
            case "id" :
                System.out.println("ID Driver");
                break;
            case "safari" :
                System.out.println("Safari Driver");
                break;
            default:
                System.out.println("Invalid");
        }
        return browser;
    }
*/

    public static String getDriver2(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("Chrome Driver");
        }else if (browser.equalsIgnoreCase("safari")){
            System.out.println("Safari Driver");
        }else if (browser.equalsIgnoreCase("firefox")){
            System.out.println("Firefox Driver");
        }else{
            System.out.println("Invalid");
        }
        return browser;
    }



}
