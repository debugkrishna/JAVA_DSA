package Array;

import java.util.Arrays;

public class CopyofArray {
    static void main() {
        int []arr={30,10,40,23,89,34};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        int [] nums=arr;//Shallow copy- change in nums will change arr also.
        System.out.println();
        nums[0]=70;
//        for(int i=0;i<arr.length;i++){
//            System.out.print(nums[i]+ " ");
//        }

        System.out.println(arr[0]);

        //Deep Copy

        int [] brr= Arrays.copyOf(arr,arr.length);
        for(int a: brr){
            System.out.print(a+" ");
        }

    }
}
