package Array;
import java.util.Arrays;
public class BuiltInMethods {
    static void main() {
        int []arr={30,10,40,23,89,34};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
