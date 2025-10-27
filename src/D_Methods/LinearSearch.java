package D_Methods;

public class LinearSearch {

    // This method performs Linear Search on an array
    public static int linearSearch(int[] arr, int target) {
        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                // Return index if element is found
                return i;
            }
        }
        // Return -1 if the element is not found
        return -1;
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the linearSearch method
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        System.out.println("Array elements:");
        printArray(numbers);

        int result = linearSearch(numbers, target);

        if (result == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }
    }
}
