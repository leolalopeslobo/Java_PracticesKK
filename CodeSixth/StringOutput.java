import java.util.Arrays;

public class StringOutput {
    public static void main(String[] args) {
        System.out.println(56);
        //internally for integers
//        Integer num = new Integer(56);
//        System.out.println(num.toString());

        System.out.println("Keith");
//        System.out.println(new int[]{1,2,3,4,5});
        //so here we are overriding the original toString so that the desired output is obtained
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));

        String name = null;
        System.out.println(name);
    }
}
