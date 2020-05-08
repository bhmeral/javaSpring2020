package day35_Static;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public class Dog {

    String breed;
    static boolean isPet ;


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.isPet = true;

        Dog dog2 = new Dog();
        dog2.breed = "Poodle";
        dog2.isPet = false;


        System.out.println(dog1.breed);
        System.out.println(dog2.breed);

        System.out.println(dog1.isPet);
        System.out.println(dog2.isPet);
    }
}
