public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is equal to the target
            if (arr[i] == target) {
                // Return the index of the target element
                return i;
            }
        }
        // If the target is not found in the array, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[1000]; // Initialize an array of size 10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // Fill the array with consecutive integers
        }
        int target = 5000;
        int result = linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index " + result);
        }
        int target2 = 6;
        int result2 = linearSearch(arr, target2);
        if (result2 == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index " + result2);
        }
    }
}


