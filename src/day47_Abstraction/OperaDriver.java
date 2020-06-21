package day47_Abstraction;

public class OperaDriver extends RemoteWebDriver {


    @Override
    public void get(String URL) {
        System.out.println("Opening " + URL + " with Opera browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing Opera browser");
    }
}
