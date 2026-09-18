import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        //originalArray
        int[] arr = {42, 17, 8, 63, 29, 51, 4, 76, 35, 12, 90, 24};
        IO.println("original array");
        IO.println(Arrays.toString(arr));

        IO.println("");
        bubbleSort(arr);
        IO.println("");
        int[] mergeResult = mergeSort(arr);
        IO.println("Merge sort Result:");
        IO.println(Arrays.toString(mergeResult));
        IO.println("");
        linearSearch(arr);
        IO.println("");
        binarySearch(mergeResult);
    }

        //bubble sort
    public static void bubbleSort(int [] arr) {
        int [] copy = new int [arr.length];

        //copying the orginal array
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy.length - 1 - i; j++) {
            if (copy[j] > copy[j + 1]) {
                int temp = copy[j];
                copy[j] = copy[j + 1];
                copy[j + 1] = temp;
            }
        }
    }
        IO.println("Bubble sort Result:");
        IO.println(Arrays.toString(copy));
    }

        //Merge sort
    public static int[] mergeSort(int [] arr) {
        int [] copy = new int [arr.length];

        //copying the orginal array
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        if (copy.length <= 1) {
            return copy;
        }
        int mid = copy.length / 2;
        int [] left = new int[mid];
        int [] right = new int[copy.length-mid];

        for (int i = 0; i < mid; i++) {
            left[i] = copy[i];
        }

        for (int i = mid; i < copy.length; i++) {
            right[i-mid] = copy[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                copy[k] = left[i];
                i++;
            } else {
                copy[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            copy[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            copy[k] = right[j];
            j++;
            k++;
        }
        return copy;
    }

        //Linear search
    public static int linearSearch(int[] arr) {
        int target = 35;

        IO.println("Linear Search Result:");
        IO.println("Target: " + target);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                IO.println("Target found at index " + i );
                return i;
            }
        }
        IO.println("Target not found");
        return -1;
    }

        //Binary search
    public static int binarySearch(int[] arr) {
        int target = 35;
        int low = 0;
        int high = arr.length - 1;

        IO.println("Binary Search Result:");
        IO.println("Target: " + target);

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                IO.println("Target found at index " + mid);
                return mid;
            }
            if(target < arr[mid]) {
                high = mid - 1;
            }  else {
                low = mid + 1;
            }
        }
        IO.println("Target not found");
        return -1;
    }
}
