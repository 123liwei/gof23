package concurrency;

import java.util.HashMap;

public class Test167 {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] res = twoSum1(arr,9);

    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int component = target - numbers[i];
            if(map.containsKey(component)){
                return new int[]{map.get(component),i};
            }
            map.put(numbers[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum1(int[] numbers, int target){
        int start = 0;
        int end = numbers.length-1;
        while (start<end){
            if(numbers[start]+numbers[end]==target){
                return new int[]{start,end};
            }else if(numbers[start]+numbers[end]<target){
                start++;
            }else {
                end--;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
