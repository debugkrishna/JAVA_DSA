package Array;

public class MaximumElement {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int mx = Integer.MIN_VALUE;
        for (int a : arr) {
//            if (a > max) {
//                max = a;
//            }
            mx=Math.max(mx,a);

        }

        System.out.println("Maximum element of array is "+ mx);
    }
}
