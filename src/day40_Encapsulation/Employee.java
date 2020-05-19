package day40_Encapsulation;

public class Employee {
    public static void main(String[] args) {
        EmployeeInfo employeeInfo1 = new EmployeeInfo();
        employeeInfo1.setAddress("1");
        employeeInfo1.setID(2);
        employeeInfo1.setSalary(34);
        employeeInfo1.setSSN(3);
        System.out.println(employeeInfo1);
    }
}
