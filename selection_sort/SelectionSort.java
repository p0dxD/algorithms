package selection_sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) throws Exception{
        int[] testArr = new int[] {2, 3, 1, 56, 9, 8, 9, 12, 11};
        System.out.println("Array before:" + Arrays.toString(testArr));

        selectionSort(testArr);

        System.out.println("Array after:" + Arrays.toString(testArr));

    }

    private static void selectionSort(int[] arr) {
        for ( int i = 0; i < arr.length; i++) {
            int current = i;
            for ( int j = i ;  j < arr.length; j++) {
                if (arr[current] > arr[j]) {
                    current = j;
                }
            }
            swap(arr, current, i);
        }
    }

    private static void swap(final int[] arr,final int i,final int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
