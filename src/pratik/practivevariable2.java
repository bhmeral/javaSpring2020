package pratik;

public class practivevariable2 {
    public static void main(String[] args) {

       byte hourlyrate=40;
       double stateTax=0.013;
       double federalTax=0.20;
       byte weeklyhours= 50;
       double yearlysalary= hourlyrate*weeklyhours*50;
       double salaryaftercut= yearlysalary* (1-(federalTax+stateTax));
        System.out.println("your salary is: " +yearlysalary);
        System.out.println("your income after tax:" +salaryaftercut);
        System.out.println("your total tax: "+ (yearlysalary-salaryaftercut));





    }
}
