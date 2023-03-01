public class StringConcepts {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";

        // using '==' to check
//        System.out.println(a==b); //if 'true' then they both point to same object

        String name1 = new String("Sam");
        String name2 = new String("Sam");
        System.out.println(name1==name2);

        System.out.println(name1.equals(name2)); //only checks if the vales are equal and not if they point to the same object

        System.out.println(name1.charAt(1)); //gets the character at index 1
    }
}
