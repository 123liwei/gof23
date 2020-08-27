package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test15 {

    public static void main(String[] args) {
        System.out.println(Test15.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length==0){
            return result;
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            int target = -nums[i];
            int start = i+1;
            int end = nums.length - 1;
            if(i>0 &&nums[i] == nums[i-1]){
                continue;
            }
            while (start<end){
                if(nums[start]+nums[end]==target){
                    List<Integer> cur = new ArrayList<>();
                    cur.add(nums[i]);
                    cur.add(nums[start]);
                    cur.add(nums[end]);
                    result.add(cur);
                    start++;
                    end--;
                    while (start<end&&nums[start]==nums[start-1]) start++;
                    while (end>start&&nums[end]==nums[end+1]) end--;
                }else if(nums[start]+nums[end]<target){
                    start++;
                }else {
                    end--;
                }
            }
        }
        return result;
    }
}
