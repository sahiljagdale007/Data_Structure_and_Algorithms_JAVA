package ELEVEN_ArrayList;

import java.util.*;
public class Sorting_Arraylist_05 {
    public static void main(String[]args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(1);
        list.add(7);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder()); //this will sort the list in reverse order
        System.out.println(list);
    }
}
