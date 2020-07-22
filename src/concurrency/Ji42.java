package concurrency;

public class Ji42 {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }


    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int former = 0;
        int cur = nums[0];
        for(int num:nums){
            cur = num;
            if(former>0) cur +=former;
            if(cur>max) max = cur;
            former=cur;
        }
        return max;
    }

}
