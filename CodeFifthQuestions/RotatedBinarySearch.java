// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int pivotBinarySearch(int[] nums, int target){
        int pivot = findPivot(nums);

        //if you didn't find a pivot, that means the array is not rotated
        if (pivot == -1){
            //just do normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // if pivot is found, you have found 2 ascending sorted arrays
        //3 cases
        if(nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    //this will not work for duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while( start <= end ){
            int mid = start + (end - start) / 2;
            //4 cases over here
            //case 1
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            //case 2
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            //case 3
            if(arr[mid] <= arr[start]){
                //ignoring the elements
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while( start <= end ){
            int mid = start + (end - start) / 2;
            //4 cases over here
            //case 1
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            //case 2
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            //case 3
            //if elements at mid, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates

                //NOTE: what if these elements at start and end were the pivots??
                //check if start is pivot
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                //check whether end is pivot or not
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                  start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end) {
            //find the middle element
//            int mid = (start + end) / 2; //might be possible that (start+end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //answer found
                return mid;
            }
        }
        return -1;
    }
}
