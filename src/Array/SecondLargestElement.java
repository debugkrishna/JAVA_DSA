package Array;

public class SecondLargestElement {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int mx = Integer.MIN_VALUE;
        int smx=Integer.MIN_VALUE +1;
        for (int a : arr) {
//            if (a > max) {
//                max = a;
//            }
            mx=Math.max(mx,a);

        }

        for(int b:arr){
            if(b!=mx){
                smx=Math.max(smx,b);
            }
        }


        System.out.println("The second maximum element of array is "+ smx);
    }}
