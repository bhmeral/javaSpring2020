package day20_ArrayContuniue;

public class ArraySize {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,};

      //  System.out.println(arr1[100]);

        int[] nums = new int[2];
        nums[0] = 10;
        nums[1] = 20;
        // nums[2] = 30, array's size is fixed

        System.out.println(nums[0]);
        System.out.println(nums[1]);
      //  System.out.println(nums[2]);

        nums = new int[3];      //Reset , {0,0,0}

        System.out.println(nums[0]); // 0
        System.out.println(nums[1]); // 0
        System.out.println(nums[2]);
    }
}
