// Find the Smallest Positive Missing Number
// https://leetcode.com/problems/first-missing-positive/

public class AmazonQuestionThree {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else {
                i++;
            }
        }

        //search for first missing number
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
