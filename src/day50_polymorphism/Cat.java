package day50_polymorphism;

public final class Cat extends Animal {
    public String catName;

    public Cat(String catName,String gender,int age){
        this.catName = catName;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println("Cat" + catName + " is eating");
    }
    public void sleep(){
        System.out.println("Cat" + catName + " is sleeping");
    }


}
