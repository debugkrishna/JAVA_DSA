package MultidimentionalArray;

import java.util.Scanner;

public class TransposeOfMatrix {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int[][] arr = new int[n][m];
        int[][] arrT = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrT[j][i]=arr[i][j];
            }
        }




        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(arrT[i][j]+" ");
            }
        }




    }


}
