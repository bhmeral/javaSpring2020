package day47_Abstraction;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        String URL = "https://www.google.com";
        chromeDriver.get(URL);
        chromeDriver.quit();

        System.out.println("=================================");

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get(URL);
        firefoxDriver.quit();

        System.out.println("=================================");

        OperaDriver operaDriver = new OperaDriver();
        operaDriver.get(URL);
        operaDriver.quit();
    }


}
