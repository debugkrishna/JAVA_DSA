package Strings;
import java.util.*;

public class AllSubstrings {
    static void main() {

        Scanner sc=new Scanner(System.in);
        String s= sc.next();

        for (int i = 0; i < s.length(); i++) {

            for (int j = i+1; j <=s.length(); j++) {

                System.out.println(s.substring(i,j));
                
            }
            System.out.println();
        }
    }
}
