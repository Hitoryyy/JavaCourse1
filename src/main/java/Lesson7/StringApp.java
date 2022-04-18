package Lesson7;

import java.util.Arrays;
import java.util.Locale;

public class StringApp {

    public static void main(String[] args) {
        String str = "String";
        System.out.println(Arrays.toString(str.toCharArray()));

        String str2 = new String(str.toCharArray());
        System.out.println(str2);

        str.toUpperCase(Locale.ROOT);
        System.out.println(str + " " + str.toUpperCase());

        System.out.println(str.startsWith("S"));

        System.out.println(str.contains("ing"));

        System.out.println(str.equalsIgnoreCase("STRING"));

        String stringUpper = "STrInG";
        System.out.println(str.equals(stringUpper));// false
        System.out.println(str.equalsIgnoreCase(stringUpper));// true

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1).append(" ").append(2);

        String newString = stringBuilder.toString();

    }
}
