package day33_CustomClass;

public class Cat {

    String breed;
    String colour;
    int age;
    String name;


    public void sleep(){
        System.out.println(name + " sleeps 15 hours in a day");
    }
    public void eat(String catFood){
        System.out.println(name + " is eating " + catFood );
    }
    public  void drink(String drinks){
        System.out.println(name + " is drinking " + drinks);
    }
    public void setCatInfo(String catBreed,String catName,String catColour,int catAge){
        breed = catBreed;
        name = catName;
        colour = catColour;
        age = catAge;
    }
    public String toString(){
        String result =  breed + " " + name + " " + colour + " " + age;
        return result;
    }
}
