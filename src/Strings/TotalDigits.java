package Strings;

import java.util.Scanner;

public class TotalDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        n=Math.abs(n);
        String s =Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());

    }
}
