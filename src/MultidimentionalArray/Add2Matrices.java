package MultidimentionalArray;

import java.util.Scanner;

public class Add2Matrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int[][] arr = new int[n][m];
        int[][] arr1 = new int[n][m];
        int[][] sum = new int[n][m];

        // Input first matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Add matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        // Print result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();


    }
}

