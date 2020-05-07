package OfficeHours.Practice_05_06_2020;

public class Developer {

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
    public void coding(){
        System.out.println(name + " is coding");
    }
    public void fixingBug(){
        System.out.println(name + " is crying");
    }

}
