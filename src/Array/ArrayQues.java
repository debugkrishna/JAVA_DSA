package Array;

public class ArrayQues {
    static void main() {
        float[] arr = {10,20,30, 30.5F,35.5F,60.5F,70,40,35,0};

        float sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (arr[i] < 35) {
                System.out.println("Roll number is " + (i + 1));
            }
        }

        System.out.println("Sum is "+ sum);
    }
}