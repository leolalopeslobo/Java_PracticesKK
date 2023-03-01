public class PalindromeString {
    public static void main(String[] args) {
//        String checkPalindrome = "abcdcba";
//        String checkPalindrome = "abccda";
        String checkPalindrome = "a";
        System.out.println(isPalindrome(checkPalindrome));
    }
    static boolean isPalindrome(String str){
        if (str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start <= end){
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }
}