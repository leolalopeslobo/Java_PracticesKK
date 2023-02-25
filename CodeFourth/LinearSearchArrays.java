public class LinearSearchArrays {
    public static void main(String[] args) {
        int[] nums = {23, 4, 7, 82, 91, 625, -11, 4, 67, -2};
        int target = -11;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

        int ansEle = linearSearchElement(nums, target);
        System.out.println(ansEle);

    }
    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index=0; index< arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        //returns -1 if element is not found i.e. array doesn't contain the target
        return -1;
    }


    //search in the array: return the element
    static int linearSearchElement(int[] arr, int target) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        //run a for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        //returns Integer.MAX_VALUE if element is not found i.e. array doesn't contain the target
        return Integer.MAX_VALUE;
    }
}

//arr.length - here length is a variable
//str.length() = here length is a method/function, which internally follows the array length