package day42_Inheritence.Task01;

public class Company {

    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static {
        employee1 = new Employee();
        employee1.setEmployeeInfo("Baha",19,'M',958496,405994043,"CEO");

        employee2 = new Employee();
        employee2.setEmployeeInfo("Aigerim",18,'F',130000,454545,"STED");

        employee3 = new Employee();
        employee3.setEmployeeInfo("Safar",25,'M',4355000,8686,"BA");
    }

    public static void main(String[] args) {
            Employee[] employees = {employee3,employee2,employee1};
            for(int i = 0; i< employees.length; i++){
                System.out.println("EmployeeName: "+employees[i].name + ", EmployeeID: " +employees[i].employeeID);
            }
    }


}
