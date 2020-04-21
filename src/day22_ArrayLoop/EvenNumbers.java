package day22_ArrayLoop;

public class EvenNumbers {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        for(int i=0; i<numbers.length; i++){
            numbers[i] = i+1;
        }
        System.out.println(numbers);

        for (int each : numbers){
            if (each%2!=0){
                continue;
            }
            System.out.println(each);
        }

    }
}
