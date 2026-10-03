package MultidimentionalArray;

import java.util.Scanner;

import static MultidimentionalArray.TransformIntoTranspose.print;

public class RotateMatrix {
    public static void main() {
// Transpose + reverse each row
        Scanner sc = new Scanner(System.in);

        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        print(arr);
        int m=arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <=i; j++) {

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }

        System.out.println();
        print(arr);

        for (int i = 0; i < m; i++) {
            int a=0; int b=m-1;
            //swap arr[i][a] and arr [i][b]

            while(a<b){
            int temp=arr[i][a];
            arr[i][a]=arr[i][b];
            arr[i][b]=temp;
            a++; b--;
            }
        }

        System.out.println();
        print(arr);

    }
}
