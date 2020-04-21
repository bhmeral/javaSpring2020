package day16_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        for( char ch = 'A'; ch<='Z'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
        for(char ch1 = 'Z'; ch1>='A'; ch1--){
            System.out.print(ch1+ " ");
        }
        System.out.println();
        for(char ch3 ='a'; ch3<='z'; ch3++){
            System.out.print(ch3+ " ");
        }
        System.out.println();
        for(char ch = 'z'; ch>='a'; ch-- ){
            System.out.print(ch+ " ");
        }

    }
}
