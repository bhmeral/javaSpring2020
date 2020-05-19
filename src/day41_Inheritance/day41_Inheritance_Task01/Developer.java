package day41_Inheritance.day41_Inheritance_Task01;

public class Developer extends  Employee{


    public Developer(double salary,String name, long id, String jobTitle,char gender){
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


         public void coding(){
             System.out.println(name + " is coding");
         }

        public void fixingBug(){
            System.out.println(name + " is fixing a bug");
        }



}
