package day22_ArrayLoop;

public class NestedLoop3 {
    public static void main(String[] args) {

        int [][] numbers =  { {1,2,3},
                            {4,5,6,7,8,9},
                            {10,11,12,13,14} ,
                            {15,16,17,18,19,20,21} } ;
        int counteven = 0;

        for (int j=0; j<numbers.length; j++){
            for (int k=0; k<numbers[j].length; k++){
                int num = numbers[j][k];
                if (num%2!=0){
                    System.out.print(num+" ");
                }else{
                    counteven++ ;
                }

            }
        }
        System.out.println();
        System.out.println(counteven);





    }
}
