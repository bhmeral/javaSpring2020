package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
  /*
        cat1.breed = "Don't Know";
        cat1.age = 10;
        cat1.colour = "Orange";
        cat1.name = "Azman";
  */
        cat1.setCatInfo("PısıPısı","Azman","Orange",10);

        cat1.eat("Fish");
        cat1.drink("Milkshake");
        cat1.sleep();

        System.out.println(cat1);

        System.out.println("===========================");

        Cat cat2 = new Cat();
        cat2.setCatInfo("Scottish","Bobo","Beige",7);
        System.out.println(cat2);

        System.out.println("===========================");

        Cat cat3 = new Cat();
        cat3.setCatInfo("Persian","Hıyar","Dark Orange" ,123);
        System.out.println(cat3);

        System.out.println("===========================");

        ArrayList<Cat> catList  = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2,cat3));

        for (int i=0; i< catList.size(); i++){
            System.out.println(catList.get(i));
        }


    }
}
