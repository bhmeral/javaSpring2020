package day41_Inheritance.day41_Inheritance_Task01;

public class Employee {


    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                '}';
    }
}
