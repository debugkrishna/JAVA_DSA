package MultidimentionalArray;
import java.util.*;


public class ArrayList2D {
    static void main() {
        int m=5;
        List<List<Integer>>v= new ArrayList<>(m);


        for (int i = 0; i < m ; i++) {
            v.add(new ArrayList<>(m));
        }
    }
}
//variable size
//Array list inside the arraylist can be of different sizes.
