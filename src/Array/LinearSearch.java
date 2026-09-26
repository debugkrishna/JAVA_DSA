package Array;
import java.util.*;


public class LinearSearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = sc.nextInt();

        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        boolean flag =false;
        for (int a : list) {
            if (a == target) {
                flag=true;
                break;
            }


        }

        if(flag) System.out.println("Element Found");
        else System.out.println("Element not found!");
    }
}