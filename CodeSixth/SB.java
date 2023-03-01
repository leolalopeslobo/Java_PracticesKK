public class SB {
    public static void main(String[] args) {
        //Performance
        /*
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series += ch; //series = series + ch
        }
        System.out.println(series);
         */

        //The above code doesn't work well since it has a lot of unwanted object creation
        // with no reference variable leading to memory wastage

        //hence solution to this issue is the use of 'StringBuilder' which allows you to
        //just append and add to the existing object

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.capacity());
    }
}
