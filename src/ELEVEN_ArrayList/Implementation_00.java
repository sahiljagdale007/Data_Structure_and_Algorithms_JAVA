package ELEVEN_ArrayList;

import java.util.*;

public class Implementation_00 {
    public static void main(String[]args) {
//Array list is inbuilt data structure in Java //ArrayList is dynamic in nature //Elements will store linearly here
        //Array list a part of java collection framework
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<String> List2 = new ArrayList<>();
        ArrayList<Boolean> List3 = new ArrayList<>();

        //Add operation
        List1.add(1);    // T.C --> O(1)
        List1.add(2);
        List1.add(3);
        List1.add(4);

        List1.add(1,9);   //T.c --> O(n)

        System.out.println(List1);

        //Get operation
        //0-Based indexing will be there in Arraylist
        int element = List1.get(2);  //T.C --> O(1)
        System.out.println(element);

        //Delete operation
        List1.remove(2);    //T.C --> O(n)
        System.out.println(List1);

        //Set operation     T.C --> O(n)
        List1.set(2,10);
        System.out.println(List1);

        //Contains operation   T.C --> O(n)
        System.out.println(List1.contains(1));
        System.out.println(List1.contains(5));
    }
}
