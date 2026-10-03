package MultidimentionalArray;

import static MultidimentionalArray.TransformIntoTranspose.print;

public class SpiralFormMatrix {
    static void main() {

        int[][] arr = {
                {1, 2, 3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        int m=arr.length; int n=arr[0].length;

        print(arr);

        //spiral print

        int minR=0,maxR=m-1;
        int minC=0,maxC=n-1;

        while(minR<=maxR && minC<=maxC){
            //left to right
            for (int j = minC; j <= maxC; j++) {
                System.out.print(arr[minR][j]+" ");
            
            }
            // Top to Bottom
            minR++;

            if(minR>maxR|| minC>maxC) break;
            for (int i = minR; i <=maxR ; i++) {
                System.out.print(arr[i][maxC]+" ");
                
            }

            maxC--;

        // Right to Left
            if(minR>maxR|| minC>maxC) break;

            for (int j = maxC; j >=minC; j--) {
                System.out.print(arr[maxR][j]+" ");

            }
            //  Bottom to Top
            maxR--;

            if(minR>maxR|| minC>maxC) break;

            for (int i = maxR; i >=minR ; i--) {
                System.out.print(arr[i][minC]+" ");

            }

            minC++;

        }




    }
}
