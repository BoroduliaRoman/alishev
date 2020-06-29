/**
 * Created by BR 29.06.2020
 */
public class Lesson23 {
    public static void main(String[] args) {
        /*
        String x = "hello";
        x = x.toUpperCase();
        System.out.println(x);
         */
        /*
        String string1 = "Hello";
        String string2 = " My";
        String string3 = " Friend";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);
         */
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
    }
}
