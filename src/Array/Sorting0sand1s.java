package Array;

import java.util.Arrays;

public class Sorting0sand1s {
    public static void main(String[] args) {


        // METHOD 1
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));


        int[] arr = {1,0,0,1,1,0};

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            // Find 1 from the left
            while (arr[i] == 0 && i < j) {
                i++;
            }

            // Find 0 from the right
            while (arr[j] == 1 && i < j) {
                j--;
            }

            // Swap
            if (arr[i]==1 && arr[j]==0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

//                arr[i]=0;
//                arr[j]=1;

                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}