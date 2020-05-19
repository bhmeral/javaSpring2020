package day40_Encapsulation;

public class Credentials {

    private  String userName;
    private  String passWord;


    public String getUserName(String userName) {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
