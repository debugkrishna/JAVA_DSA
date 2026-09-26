package Array;

import java.util.Scanner;

public class NextGreatestElement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,8,41,60,2,49,16,28,21};
        int n= arr.length;

        int[] arr2 = new int[n];
        // METHOD 1: BRUTE FORCE
//        for (int i = 0; i < n; i++) {
//            // Last element
//            if (i == n - 1) {
//                arr2[i] = -1;
//                continue;
//            }
//            int max = arr[i + 1];
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] > max) {
//                    max = arr[j];
//                }
//            }
//
//            arr2[i] = max;
//        }
//        for (int a : arr2) {
//            System.out.print(a + " ");
//        }


        //METHOD 2:

        int nge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr2[i]=nge;
            nge=Math.max(nge,arr[i]);

        }

                for (int a : arr2) {
            System.out.print(a + " ");
    }
}}