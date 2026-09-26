package Array;
import java.util.*;

public class TwoSum {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Target : ");
        int target=sc.nextInt();

        int [] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                if( arr[i]+arr[j]==target){
                    System.out.println("The doublets are "+ arr[i]+" and " +arr[j]);
                }

            }
        }
    }
}
