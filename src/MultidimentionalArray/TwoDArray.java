package MultidimentionalArray;

public class TwoDArray {
    static void main() {
        int [][] arr= new int [3][4];//3 rows 4 columns
        int [][] arr1= {{1,2,3},{4,5,6},{7,8,9}};

//        for(int [] a:arr1) {
//            System.out.println();
//            for(int c: a){
//            System.out.print(c+" ");
//        }}

        for(int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]+" ");
            }
        }

    }
}
