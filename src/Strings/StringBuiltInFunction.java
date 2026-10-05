package Strings;

import java.util.Locale;

public class StringBuiltInFunction {
    static void main() {
        String s="Krishna";
        System.out.println(s.indexOf("s"));
        System.out.println(s.lastIndexOf('a'));
        //compareTo() - used to compare two given strings lexographically

        String a="krishna is good boy";
        String b=" and studies in 5th sem";

        System.out.println(a.compareTo(b));

        System.out.println(s.startsWith("K"));
        System.out.println(s.contains("ri"));
        System.out.println(s.endsWith("na"));

        System.out.println(a.toUpperCase());

        System.out.println(a.concat(b));
        a=a.concat(b);
        System.out.println(a);


    }
}
