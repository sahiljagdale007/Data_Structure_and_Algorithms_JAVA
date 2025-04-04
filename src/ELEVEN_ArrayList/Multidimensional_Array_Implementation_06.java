package ELEVEN_ArrayList;

import java.util.*;

public class Multidimensional_Array_Implementation_06 {
    public static void main(String[]args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); list.add(6); list.add(7);
        mainList.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(8); list1.add(9); list1.add(10);
        mainList.add(list1);

        for(int i=0; i< mainList.size(); i++) {
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j=0; j<currentList.size(); j++) {
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
