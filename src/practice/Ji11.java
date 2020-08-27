package practice;

public class Ji11 {

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int res = minArray(nums);
        System.out.println(res);
    }

    public static int minArray(int[] numbers) {
        int start = 0;
        int end = numbers.length-1;
        while (start<end){
            int target = start + (end - start)/2;
            if(numbers[target]>numbers[end]){
                start = target + 1 ;
            }else if(numbers[target]<numbers[end]){
                end = target;
            }else {
                end -= 1;
            }
        }
        return numbers[start];
    }

}
