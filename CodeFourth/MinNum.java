public class MinNum {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
    }

    //assume arr.length!=0
    //return the min value in the array
    static int min(int[] arr){
        int min = arr[0];
        for (int ele : arr) {
            if(ele < min) {
                min = ele;
            }
        }
        return min;
    }
}