package day41_Inheritance.day41_Inheritance_Task01;

public class BusinessAnalyst extends Employee {

    public BusinessAnalyst(String name,double salary,long id,char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        jobTitle = "Business Analyst";
        this.gender = gender;
    }

    public void writingReq() {
        System.out.println(name + " is writing requirements");
    }

    public void gathering() {
        System.out.println(name + " is gathering requirements");
    }






}
