package ELEVEN_ArrayList;
import java.util.*;
public class Size_of_ArrayLIist_01 {
    public static void main(String[]args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}
