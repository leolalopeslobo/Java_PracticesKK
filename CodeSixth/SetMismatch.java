// https://leetcode.com/problems/set-mismatch/

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else {
                i++;
            }
        }

        //search for first missing number
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
