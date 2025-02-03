package FOURE_Sorting_Algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class inbuilt_sort_03 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
       // Arrays.sort(arr, Collections.reverseOrder()); //<----------------This function is used to reverse an array
        printArr(arr);
        //Arrays.sort(arr);                               //<--------------This is the inbuilt function to sort an array

    }
}
