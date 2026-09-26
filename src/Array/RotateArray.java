package Array;
import java.util.*;

// Rotate Array by K Steps.
// K can be greater than array size
//K=k%n times rotating = k times rotating


// Using extra array.

public class RotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array : ");
        int n = sc.nextInt();
        System.out.println("Show much to rotate :");
        int r= sc.nextInt();
        int[] arr = new int[n];
        int[]arr2=new int[n];
        int k=0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));

        for(int j=n-r;j<n;j++){
            arr2[k]=arr[j];
            k++;
        }

        for(int i=0;i<n-r;i++){
            arr2[k]=arr[i];
            k++;
        }

        System.out.println("Rotated array: "+ Arrays.toString(arr2));

}}
