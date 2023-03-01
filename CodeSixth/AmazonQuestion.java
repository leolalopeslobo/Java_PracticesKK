//https://leetcode.com/problems/missing-number/
//Amazon Question

import java.util.Arrays;

public class AmazonQuestion {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
//        int[] arr = {2,1,3,0};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            } else {
                i++;
            }
        }
        System.out.println(checkForMissingNumber(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int checkForMissingNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i){
                return i;
            }
        }
        //case2: return N
        return arr.length;
    }
}
