package MultidimentionalArray;

public class WaveformPrinting {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 != 0) {
                int a = 0;
                int b = arr[i].length - 1;

                while (a < b) {
                    int temp = arr[i][a];
                    arr[i][a] = arr[i][b];
                    arr[i][b] = temp;

                    a++;
                    b--;
                }
            }

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}