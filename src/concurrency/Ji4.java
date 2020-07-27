package concurrency;

public class Ji4 {

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean flag = findNumberIn2DArray(matrix ,5);
        System.out.println(flag);
    }


    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns-1;
        while (row < rows && column>0){
            if(target == matrix[row][column]){
                return true;
            }else if(target > matrix[row][column]){
                row++;
            }else {
                column--;
            }
        }
        return false;
    }

}
