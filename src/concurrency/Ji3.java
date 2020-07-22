package concurrency;

import java.util.HashMap;

public class Ji3 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int res = findRepeatNumber(nums);
        System.out.println(res);
    }

    public static int findRepeatNumber(int[] nums) {
        int res = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                res = nums[i];
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }

}
