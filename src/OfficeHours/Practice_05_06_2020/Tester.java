package OfficeHours.Practice_05_06_2020;

public class Tester {
    String name;
    String jobTitle;
    double Salary;
    int employeeID;


    public void setInfo(String name, String jobTitle, double Salary, int employeeID){
        this.name=name;
        this.jobTitle=jobTitle;
        this.Salary=Salary;
        this.employeeID=employeeID;
    }

    public String toString(){
        return "Employee Name: " + name + "\n" + "Job Title: " + jobTitle + "\n" + "Salary: " + Salary + "$" +  "\n" + "Employee ID: " + employeeID;
    }

    public void  smokeTesting(){
        System.out.println(name + " is doing smoke test");
    }
    public void creatingTicket(){
        System.out.println(name + " is creating ticket on Jira");
    }
}
