import java.util.Arrays;

public class LinearSearchStrings {
    public static void main(String[] args) {
        String name = "Mallory";
        char target = 'a';
        System.out.println(name);
        System.out.println(name.toCharArray());  //converting a String into char array
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,target));
        System.out.println(searchChar(name,target));
    }

    static boolean searchChar(String str, char c){
        if(str.length() == 0) {
            System.out.println("Empty String");
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == c) {
                System.out.println("forEach loop");
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char c){
        if(str.length() == 0) {
            System.out.println("Empty String");
            return false;
        }

        for(int i=0; i<str.length(); i++) {
            if (c == str.charAt(i)) {
                System.out.println("for loop");
                return true;
            }
        }
        return false;
    }
}
