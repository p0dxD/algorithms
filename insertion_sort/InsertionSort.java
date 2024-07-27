package insertion_sort;

import java.util.Arrays;

public class InsertionSort {
 
    public static void main(String[] args) throws Exception{
        int[] testArr = new int[] {2, 3, 1, 56, 9, 8, 9, 12, 11};
        System.out.println("Array before:" + Arrays.toString(testArr));

        insertionSort(testArr);

        System.out.println("Array after:" + Arrays.toString(testArr));

    }

    private static void insertionSort(int[] arr) {
        for ( int i = 0; i < arr.length; i++) {
            for ( int j = i ;  j > 0; j--) {
                if (arr[j-1] > arr[j]) {
                    swap(arr, j-1, j);
                }
            }
        }
    }

    private static void swap(final int[] arr,final int i,final int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}