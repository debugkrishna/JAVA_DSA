package MultidimentionalArray;
import java.util.*;

public class Ques1 {
    static void main() {
        Scanner sc =new Scanner((System.in));

        int n=sc.nextInt();
        int [][] arr= new int [n][2];

        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<4;i++){
            System.out.println();
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+ " ");;
            }
        }


    }
}
