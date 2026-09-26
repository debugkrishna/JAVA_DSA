package Array;

public class MinimumElement {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,-99};
        int mn = Integer.MAX_VALUE;
        for (int a : arr) {
//            if (a < mn) {
//                mn = a;
//            }
            mn=Math.min(mn,a);

        }

        System.out.println("Minimum element of array is "+ mn);
    }}
