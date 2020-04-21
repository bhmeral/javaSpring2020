package OfficeHours.Practice_04_15_20_ArraysStr;

public class NestedLoops {
    public static void main(String[] args) {

        char[][] arr2D = { {'A','B'},{'C','D','E'},{'F','J','H'}};
                    //          0           1              2

            // arr2D[0]
        for (int i=0; i<arr2D[0].length; i++){
            System.out.println(arr2D[0][i]);
        }
            // arr2D[1]
        for (int k=0; k<arr2D[1].length; k++){
            System.out.println(arr2D[1][k]);
        }

        System.out.println("=====================================");

          for (int j=0; j<arr2D.length; j++){          // j: index num of  in 1D arrays
              for (int l=0; l<arr2D[j].length; l++){      // i: index num of element in 1D

                  System.out.print(arr2D[j][l]+ " ");
              }
          }
        System.out.println();

        System.out.println("=====================================");
       // arr2D = { {'A','B'},{'C','D','E'},{'F','J','H'}};
        //          0           1              2

        for (char[] each1DArray :arr2D){
            for (char eachLetter :each1DArray){
                System.out.print(eachLetter+ " ");
            }
        }


    }
}
