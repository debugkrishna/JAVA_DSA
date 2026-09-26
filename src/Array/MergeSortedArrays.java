package Array;
import java.util.*;

public class MergeSortedArrays {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr0 = new int[n];

        for(int i = 0; i < n; i++) {
            arr0[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr1 = new int[m];

        for(int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge while both arrays have elements
        while(i < n && j < m) {

            if(arr0[i] <= arr1[j]) {
                arr2[k] = arr0[i];
                i++;
            }
            else {
                arr2[k] = arr1[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of arr0
        while(i < n) {
            arr2[k] = arr0[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr1
        while(j < m) {
            arr2[k] = arr1[j];
            j++;
            k++;
        }

        // Print merged array
        for(int a : arr2) {
            System.out.print(a + " ");
        }
    }
}