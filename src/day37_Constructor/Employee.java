package day37_Constructor;

public class Employee {
    String name;
    long ID;
    long SSN;
    String jobTitle;
    double salary;
    char gender;

    public  void  setInfo(String employeeName,long employeeID,long employeeSSN,String employeeJobTitle,double employeeSalary,char employeeGender){
        name = employeeName;
        ID = employeeID;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;
        gender = employeeGender;
    }

    public String toString(){
        return "EmployeeName: " + name + "\n" + "EmployeeID: " + ID + "\n" + "EmployeeSSN: " + SSN +
                "\n" + "EmployeeJobTitle: " + jobTitle + "\n" + "EmployeeSalary: " + salary +"\n"
                + "EmployeeGender: " + gender + "\n" + "====================";
    }
}
