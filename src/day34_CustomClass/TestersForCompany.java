package day34_CustomClass;

public class TestersForCompany {

    /*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
create a class called Bank Of America:
			bank of America is planning to create their automation team, there fore they are hiring three testers
			create a list called AutomationTeam and store three Testers in it
			write a program that can remove the tester if he/she is manual tester
			write a program that can calculate the total budget of the Automation team
 */

    String name;
    int employeeID;
    String JobTitle;
    double Salary;



    public void setTesterInfo(String employeeName,int employeeID,String employeeJobTitle,double employeeSalary){
        name=employeeName;
        this.employeeID=employeeID;
        JobTitle=employeeJobTitle;
        Salary=employeeSalary;
    }
    public String toString(){
        return "Name: " + name +"\n" +"EmployeeID: " + employeeID + "\n"+"Job Title: " + JobTitle + "\n" +"Salary:" + Salary + "$";
    }

    public void smokeTesting(){

    }
    public void creatingTicket(){

    }

}
