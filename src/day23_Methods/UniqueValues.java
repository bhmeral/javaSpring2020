package day23_Methods;

public class UniqueValues {
    public static void main(String[] args) {
        String [] arr = {"A","B","A"};


        for (String each : arr){
            int count1 = 0;
            for (int i=0; i<arr.length;i++){
                if (arr[i].equals(each)){
                    count1++;
                }



            }

            if (count1==1){
                System.out.println(each);
            }
        }
        System.out.println("000000000000000000000000000000000000000000000000000");
        /*
        //"A"
        int count2 =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i].equals("B")) {
                count2++;
            }

        }

        if (count2 == 1) {
            System.out.println("B");
        }
        */





















    }
}
