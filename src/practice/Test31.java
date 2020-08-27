package practice;

import java.util.Arrays;

public class Test31 {

    public static void main(String[] args) {
        Test31.nextPermutation(new int[]{1,2,3,7,5,6,4});
    }


    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i>0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>0){
            int j = nums.length - 1;
            while (j>0&&nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
