package Strings;

import java.util.Scanner;

public class InputString {
    static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
//        String str=Sc.next();//for one word
//        String s ="Hello";
//        System.out.println(str);

        String str1=Sc.nextLine();//for one line
        System.out.println(str1);

        System.out.println(str1.charAt(0));
        System.out.println(str1.length());


    }
}
