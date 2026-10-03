package MultidimentionalArray;

import java.util.*;
class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dimensions
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();

        // Matrix A: m x n
        int[][] a = new int[m][n];

        // Matrix B: n x p
        int[][] b = new int[n][p];

        // Result matrix: m x p
        int[][] c = new int[m][p];

        // Input matrix A
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}