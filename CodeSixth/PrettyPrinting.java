//Printing using PlaceHolders

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 465.8856f;
        //it prints the formatted version along with rounding it
        System.out.printf("Formatted number is %.2f",a);

        System.out.println();
        System.out.printf("Pie: %.2f",Math.PI);

        System.out.println();
        System.out.printf("Hi! My name is %s and I'm from %s","Denver","New Zealand");
    }
}
