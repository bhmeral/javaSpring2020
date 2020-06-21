package day50_polymorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a = 100;
        double b = a; // implicitly done

        Dog dog = new Dog("a","m",1);
        Animal animal = dog;  // upcasting, done implicitly

        Cat cat = new Cat("r","female",4);
        //Dog dog2 = (Dog)cat;
        Animal animal2 = cat; // upcasting, done implicitly
        System.out.println("==========================================");
        double c = 10;
        int d = (int)c; // explicitly done
        Animal animal3 = new Dog("a","F",12);
        Dog dog3 = (Dog)animal3;  // down casting , MUST be done manually.
        
    }
}
