package day34_CustomClass;

public class Dogge {

    String breed;
    String size;
    int age;
    String color;
    String name;



    public void setDogInfo(String breed,String size , int age ,String color ,String name){
        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
        this.name=name;
    }

    public String toString(){
        return "Name: " + name + "," + " Breed: " + breed + "," + " Age: " +age + "," + " Color: " + color + "," + " Size: " + size;
    }

    public void Sleep(int hour){
        System.out.println(name + " sleeps " + hour + " hours everyday.");
    }
    public void Eat(String food){
        System.out.println(name + " eating " + food + ".");
    }
    public void Sit(){
        System.out.println(name + " sitting.");
    }
    public void Run(){
        System.out.println(name + " running.");
    }

}
