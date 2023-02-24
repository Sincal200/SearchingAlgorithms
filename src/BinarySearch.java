import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[1000]; // Initialize an array of size 10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // Fill the array with consecutive integers
        }
        int target = 900;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index " + result);
        }

        int target2 = 10000;
        int result2 = binarySearch(arr, target2);
        if (result2 == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index " + result2);
        }
    }
}
