package day38_Constructors;

public class DogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1.name); // unknown
        System.out.println(dog1.breed); // unknown
        System.out.println(dog1.age); // 0
        System.out.println("D o o o o o g g g g e e e e e ");
        Dog dog2 = new Dog("Husky");
        System.out.println(dog2.name); // unknown
        System.out.println(dog2.breed); // Husky
        System.out.println(dog2.age); // 0
        System.out.println("D o o o o o g g g g e e e e e ");
        Dog dog3 = new Dog("Sausage",5);
        System.out.println(dog3.name);
        System.out.println(dog3.breed);
        System.out.println(dog3.age);
        System.out.println("D o o o o o g g g g e e e e e ");
        System.out.println(dog1);
        System.out.println("D o o o o o g g g g e e e e e ");
        System.out.println(dog2);
        System.out.println("D o o o o o g g g g e e e e e ");
        System.out.println(dog3);

    }
}
