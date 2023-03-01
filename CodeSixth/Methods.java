import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String naam = "Kunal Kushwaha";
        System.out.println(Arrays.toString(naam.toCharArray())); // [K, u, n, a, l,  , K, u, s, h, w, a, h, a]
        System.out.println(naam.lastIndexOf("a")); // 13
        System.out.println("   Kunal    ".strip()); // Kunal
        System.out.println(Arrays.toString(naam.split(" "))); // [Kunal, Kushwaha]
    }
}
