import java.util.Arrays;

public class RowColMatrixVariable {
    public static void main(String[] args) {
        int[][] arr ={
                {10, 20, 30, 40},
                {15, 25, 35, 45, 55},
                {28, 29, 37, 49},
                {33, 34, 38},
                {42, 44, 46, 47, 48, 57}
        };
        System.out.println(Arrays.toString(search(arr,57)));

    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[row].length - 1; //change this value for uneven 2D array

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target){
                row++;
                col = matrix[row].length - 1;
            } else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
