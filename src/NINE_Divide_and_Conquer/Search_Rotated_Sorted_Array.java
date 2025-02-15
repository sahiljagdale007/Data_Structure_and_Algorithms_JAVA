package NINE_Divide_and_Conquer;

public class Search_Rotated_Sorted_Array {
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {                  //base case
            return -1;
        }
        int mid = si + (ei - si) / 2;     //mid
        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {      //checking in left part
            if ((arr[si]) <= tar && tar <= (arr[mid])) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            if ((arr[mid]) <= tar && tar <= (arr[ei])) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 0;
        int tarIdx = search(arr, tar, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
