//package Array;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ReverseArray {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter Element " + (i + 1));
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Original array: " + Arrays.toString(arr));
//
//        int temp;
//        // i + j = n-1
//        for (int j = 0; j < n / 2; j++) {
//
//            temp = arr[j];
//            arr[j] = arr[n - 1 - j];
//            arr[n - 1 - j] = temp;
//        }
//
//        System.out.println("Reversed array: " + Arrays.toString(arr));
//    }
//}


// USING WHILE LOOP //

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i + 1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        int temp;
        // i + j = n-1

        int k = n - 1;
        int j = 0;

        while (j < k) {

            swap(arr,j,k);
            j++;
            k--;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));

    }
        public static void swap(int [] arr,int j,int k){

            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;


    }





}