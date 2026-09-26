package Array;

import java.util.*;

class RotateArrayInplace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Input array
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        int k = sc.nextInt();

        // Rotate array
        RotateArrayInplace obj = new RotateArrayInplace();
        obj.rotate(nums, k);

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }

    public void reverse(int[] nums, int i, int j) {

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // Reverse first part
        reverse(nums, 0, n - k - 1);

        // Reverse second part
        reverse(nums, n - k, n - 1);

        // Reverse entire array
        reverse(nums, 0, n - 1);
    }
}