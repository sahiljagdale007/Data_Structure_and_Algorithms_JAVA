package NINE_Divide_and_Conquer;

import java.util.*;

public class Quick_Sort_01 {
    public static void printArr(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];      //simple swapping
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];         //pivot swapping
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
