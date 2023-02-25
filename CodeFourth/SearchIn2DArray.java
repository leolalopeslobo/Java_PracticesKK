import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {12, 18, 102}
        };
        int target = 34;
        int[] ans = search(arr, target); //format of return value {row, col}
        System.out.println(Arrays.toString(ans));

        System.out.println("Minimum value in Java: "+Integer.MIN_VALUE);
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target) {
        for (int row=0; row<arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col}; //creating and initializing a new object
                }
            }
        }
        return new int[]{-1,-1};
    }

    //Q. Maximum value in a 2D array
    static int max(int[][] arr) {
//        int max = arr[0][0];
        int max = Integer.MIN_VALUE; //the min value that in java that can be present
        for (int row=0; row<arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
