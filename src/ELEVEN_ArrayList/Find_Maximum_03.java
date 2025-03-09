package ELEVEN_ArrayList;

import java.util.ArrayList;

public class Find_Maximum_03 {
    public static void main(String[]args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(13);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<=list.size()-1; i++) {
//            if(max < list.get(i)) {
//                max = list.get(i);
//            }
            max = Math.max(max, list.get(i));
        }
        System.out.print("Max Element is : "+ max);
    }
}
