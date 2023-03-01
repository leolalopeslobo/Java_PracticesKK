import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //adding the ASCII values
        System.out.println("a"+"b"); //concatenates
        System.out.println("a"+'b'); //ab
        System.out.println('a'+"b");
        System.out.println('a'+3); //97 + 3 = 100
        System.out.println((char)('a'+3)); //d
        //this is the same as "a"+"1", so they are concatenated
        System.out.println("a"+1); //so integer will be converted into Integer that will call toString()
        System.out.println("Kunal" + new ArrayList<>()); //output: Kunal[]

//        System.out.println(new ArrayList<>() + new Integer(56)); //does not work
        System.out.println(new ArrayList<>() + "" + new Integer(56)); //works since there is at least one string present
        //concatenation also works when you have a primitive and a String object
//        System.out.println(23 + new ArrayList<>()); //doesn't work
    }
}
