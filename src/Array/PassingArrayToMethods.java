package Array;

public class PassingArrayToMethods {
    static void main() {
        int x=5;
        int []arr={1,2,3,4,5};
        System.out.println(x);
        System.out.println(arr[0]);
        change(x);
        changearr(arr);
        System.out.println(x);
        System.out.println(arr[0]);
    }

    public static void changearr(int[] arr) {
        arr[0]=100;//pass by reference
    }

    public static void change(int x) {
        x=10;//pass by value
    }
}
