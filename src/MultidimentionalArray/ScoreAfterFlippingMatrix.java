package MultidimentionalArray;

public class ScoreAfterFlippingMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0}
        };

        Solution sol = new Solution();

        int score = sol.matrixScore(arr);

        System.out.println("Score = " + score);
    }

    static class Solution {

        public int matrixScore(int[][] arr) {

            int m = arr.length;
            int n = arr[0].length;

            // Step 1: Make the first element of every row 1
            for (int i = 0; i < m; i++) {

                if (arr[i][0] == 0) {

                    // Flip the entire row
                    for (int j = 0; j < n; j++) {
                        arr[i][j] = 1 - arr[i][j];
                    }
                }
            }

            // Step 2: Flip columns where 0s > 1s
            for (int j = 1; j < n; j++) {

                int noOfZeros = 0;
                int noOfOnes = 0;

                for (int i = 0; i < m; i++) {

                    if (arr[i][j] == 0) {
                        noOfZeros++;
                    } else {
                        noOfOnes++;
                    }
                }

                // Flip column if zeros are more
                if (noOfZeros > noOfOnes) {

                    for (int i = 0; i < m; i++) {
                        arr[i][j] = 1 - arr[i][j];
                    }
                }
            }

            // Step 3: Calculate score
            int score = 0;

            for (int i = 0; i < m; i++) {

                int rowValue = 0;

                for (int j = 0; j < n; j++) {
                    rowValue = rowValue * 2 + arr[i][j];
                }

                score += rowValue;
            }

            return score;
        }
    }
}