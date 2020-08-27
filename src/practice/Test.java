package practice;

public class Test {

    private static void quickSort(int[] num, int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if(left>=right) {
            return;
        }
        //设置最左边的元素为基准值
        int key=num[left];
        //数组中比key小的放在左边，比key大的放在右边，key值下标为i
        int i=left;
        int j=right;
        while(i<j){
            //j向左移，直到遇到比key小的值
            while(num[j]>=key && i<j){
                j--;
            }
            //i向右移，直到遇到比key大的值
            while(num[i]<=key && i<j){
                i++;
            }

            //i和j指向的元素交换
            if(i<j){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        num[left]=num[i];
        num[i]=key;
        quickSort(num,left,i-1);
        quickSort(num,i+1,right);
    }


    public static void main(String[] args) {
        String a ="AE";
        int p = getIndexByChoiceAnswer(a);
        System.out.println(p);
    }


    public static int getIndexByChoiceAnswer(String choice) {
        choice=choice.replace("&nbsp;","");
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(choice.trim())+1;
    }

}
