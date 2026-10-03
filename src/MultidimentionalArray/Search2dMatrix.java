package MultidimentionalArray;

class Sol {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length,n=arr[0].length;
        //fix pivot
        int i=0,j=n-1;
        while(i<m && j>=0){
            if(arr[i][j]==target) return true;

            else if(arr[i][j]>target){
                //go left
                j--;//row same but column --
            }

            else{
                // go down
                i++;
            }

        }

        return false;

    }
}
public class Search2dMatrix  {
    static void main() {

    }
}
