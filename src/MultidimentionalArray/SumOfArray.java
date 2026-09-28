package MultidimentionalArray;

import java.util.Scanner;

public class SumOfArray {
    static void main() {

            Scanner sc =new Scanner((System.in));
            int sum =0;
            int [][] arr= new int [2][2];

            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    sum+=arr[i][j];
                }
                }



            System.out.println("Sum of  elements is "+ sum);

        }
}
