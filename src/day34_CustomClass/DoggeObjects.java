package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DoggeObjects {
    public static void main(String[] args){
        Dogge dogge1 = new Dogge();
        Dogge dogge2 = new Dogge();


        dogge1.setDogInfo("Woof,Woof","Small",12,"Yellow","Waaov");
        System.out.println(dogge1);
        dogge2.setDogInfo("Hav,Hav","Big",20,"White","Poof");
        System.out.println(dogge2);

        System.out.println("=============================");

        dogge1.Eat("Bone");
        dogge1.Run();
        dogge1.Sit();
        dogge1.Sleep(7);

        dogge2.Eat("Fish");
        dogge2.Run();
        dogge2.Sit();
        dogge2.Sleep(10);

        System.out.println("=============================");

        Dogge[] dogPark =  {dogge1,dogge2};
        
        for (int i=0; i<dogPark.length; i++){
            dogPark[i].Eat("Bone");
        }


        System.out.println("=============================");

        ArrayList<Dogge> dogges = new ArrayList<>();
        dogges.addAll(Arrays.asList(dogge1,dogge2));
        for (int i=0; i<dogges.size(); i++){
           Dogge dogge = dogges.get(i);
            System.out.println(dogge);
        }

        System.out.println("==============================");
        dogges.removeIf(p-> p.age<2);



    }
}
