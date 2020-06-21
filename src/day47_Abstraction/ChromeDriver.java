package day47_Abstraction;

public  class ChromeDriver extends RemoteWebDriver{

    /*
    public void get(String URL){
        System.out.println("Open Chrome");
    }
     */

    @Override
    public void get(String URL){
        System.out.println("Opening the " + URL + " in chrome browser");
    }

    @Override
    public void quit(){
        System.out.println("Closing the browser");
    }

}
