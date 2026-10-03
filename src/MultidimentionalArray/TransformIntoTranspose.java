package MultidimentionalArray;

public class TransformIntoTranspose {

    public static void print(int [][] arr){
        int m=arr.length; int n= arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }

   public static void main() {
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

    }
}
