package Array;
import java.util.ArrayList;
public class ArrayLIstMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(0,10);//initialize
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
//
//    for(int i=0;i<arr.size();i++){
//        System.out.println(arr.get(i));
//    }

        System.out.println(arr);

        arr.set(1,100);//modify

        System.out.println(arr);

        arr.remove(2);

        System.out.println(arr);
    }
}
