package binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("is in array?" + binarySearch(test, 10));

    }

    private static boolean binarySearch(int[] arr, int value){
        
        int low = 0;
        int high = arr.length-1;
        int middle = (low + high)/2;

        while (low <= high) {
            if (value == arr[middle]) {
                return true;
            } else if (value < arr[middle]) {
                high = middle-1;
            } else {
                low = middle+1;
            }
            middle = (low + high)/2;
        }
        return false;
    }
}
