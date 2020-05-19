package day41_Inheritance.day41_Inheritance_Task01;

public class Tester extends Employee{


    public void reporting(){
        System.out.println(name + " is reporting");
    }

    public void testing(){
        System.out.println(name + " is testing");
    }

    public Tester(String name,double salary,int id,String jobtitle,char gender){
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobtitle;
        this.gender = gender;
    }

}
