public class SearchInRange {
    public static void main(String[] args) {
        //Q. Search for 3 in the index 1 till 4
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index=start; index<end+1; index++) {
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
}
