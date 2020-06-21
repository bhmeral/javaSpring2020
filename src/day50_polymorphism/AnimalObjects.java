package day50_polymorphism;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal dog = new Dog("Lucy","Female",5);

        Dog dog1 = new Dog("Amca","Male",3);
        System.out.println(dog1.dogName);
        dog1.bark();

        Animal animal = new Cat("Murtaza","Male",3);

        boolean isCat = animal instanceof Cat;
        System.out.println(isCat);

        Dog d1 = new Dog("Feyyaz","Male",5);

       // boolean r1 = d1 instanceof Cat; there is no  IS A relation between them.

        Animal animal2 = new Cat("q","f",2);
        boolean r2 = animal2 instanceof Animal;
        System.out.println(r2);

    }
}
