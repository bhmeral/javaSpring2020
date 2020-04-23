package pratik;

public class unique_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1,3,2,5};
        unique(arr);
    }


    public static  void unique(int [] arr){
            int unique = 0;
        for (int i=0; i<arr.length; i++){
            int count = 0;

            if (unique==arr[i]){
                count++;

            }
            if (count==1){
                System.out.println(unique);
            }
            unique++;
        }

    }
}
