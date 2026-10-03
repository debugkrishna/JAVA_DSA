package MultidimentionalArray;

class Meth1 {
    public void setZeroes(int[][] arr) {

        // Method 1: Helper array
        int m = arr.length;
        int n = arr[0].length;

        int[][] helper = new int[m][n];

        // Deep copy
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                helper[i][j] = arr[i][j];
            }
        }

        // Check helper and modify original array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (helper[i][j] == 0) {

                    // Set entire row to 0
                    for (int b = 0; b < n; b++) {
                        arr[i][b] = 0;
                    }

                    // Set entire column to 0
                    for (int a = 0; a < m; a++) {
                        arr[a][j] = 0;
                    }
                }
            }
        }
    }
}

class Meth2 {
public void setZeroes(int[][] arr) {

    int m = arr.length;
    int n = arr[0].length;

    boolean [] row= new boolean[m];
    boolean [] col= new boolean[n];


    // marking particular row and column
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if(arr[i][j]==0){
                row[i]=true;
                col[j]=true;
            }
        }
    }

    //Set the 'True ' rows to 0
    for(int i=0;i<m;i++){
        if(row[i]==true){
            //set ith row to 0

            for(int j=0;j<n;j++){
                arr[i][j]=0;
            }

        }
    }

//Set the 'True ' cols to 0
    for(int j=0;j<n;j++){
        if(col[j]==true){
            //set jth col to 0

            for(int i=0;i<m;i++){
                arr[i][j]=0;
            }

        }
    }

}
}


class Meth3 {
    public void setZeroes(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        boolean zeroRow = false;
        boolean zeroCol = false;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                zeroRow = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                zeroCol = true;
                break;
            }
        }

        // Use first row and first column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Set marked rows to zero
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Set marked columns to zero
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Finally handle first row
        if (zeroRow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // Finally handle first column
        if (zeroCol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }
}
public class SetMatricesZero {
    static void main() {

    }
}
