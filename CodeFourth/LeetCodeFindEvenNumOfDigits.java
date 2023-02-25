//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class LeetCodeFindEvenNumOfDigits {
    public static void main(String[] args) {
        //Q. Given an array nums of integers, return how many of them contain an even number of digits
        int[] nums = {12, 345, 2 ,6, 7896, 7, 98};
        System.out.println("Using even method");
        int output = findNumbers(nums);
        System.out.println(output);
        System.out.println("Using evenEasier method");
        int outputEasier = findNumbersEasier(nums);
        System.out.println(outputEasier);
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static int findNumbersEasier(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (evenEasier(num)) {
                count++;
            }
        }
        return count;
    }


    //function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }

    static int digits(int num) {
        //if num is (-) negative, make it positive
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }

    static boolean evenEasier(int num) {
        String num_str = Integer.toString(num);
        return num_str.length() % 2 == 0;
    }

    //shortcut to get number of digit in any number
    static int getDigitShortcut(int num){
        //for negative numbers
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}