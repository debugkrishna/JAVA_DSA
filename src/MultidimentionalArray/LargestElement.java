package MultidimentionalArray;

import java.util.Scanner;
import java.util.*;
public class LargestElement {
    static void main() {
        int mx= Integer.MIN_VALUE;
        Scanner sc =new Scanner((System.in));

        int n=sc.nextInt();
        int [][] arr= new int [2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(mx<arr[i][j]) mx=arr[i][j];
            }
        }

        System.out.println("Largest element is "+ mx);


    }
}
