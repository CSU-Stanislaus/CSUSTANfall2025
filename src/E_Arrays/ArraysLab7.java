package E_Arrays;

public class ArraysLab7 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // Uncomment lines after you write each method
        // ===========================

        // Q1: sumArray
        // int[] nums1 = {1, 2, 3, 4};
        // int[] nums2 = {10, -5, 2};
        // System.out.println("sumArray(nums1) = " + sumArray(nums1)); // 10
        // System.out.println("sumArray(nums2) = " + sumArray(nums2)); // 7

        // Q2: firstElement
        // int[] a = {42, 99, 100};
        // int[] b = {5};
        // System.out.println("firstElement(a) = " + firstElement(a)); // 42
        // System.out.println("firstElement(b) = " + firstElement(b)); // 5

        // Q3: lastElement
        // String[] words1 = {"apple", "banana", "cherry"};
        // String[] words2 = {"hi"};
        // System.out.println("lastElement(words1) = " + lastElement(words1)); // "cherry"
        // System.out.println("lastElement(words2) = " + lastElement(words2)); // "hi"

        // Q4: countEvens
        // int[] z1 = {2, 5, 8, 11, 14}; // evens: 2,8,14 → 3
        // int[] z2 = {1, 3, 5};        // evens: none → 0
        // System.out.println("countEvens(z1) = " + countEvens(z1));
        // System.out.println("countEvens(z2) = " + countEvens(z2));

        // Q5: toStringArray
        // int[] demo = {7, 8, 9};
        // System.out.println("toStringArray(demo) = " + toStringArray(demo));
        // Expected: "[7, 8, 9]"
    }


    // ============================================================
    // Q1. sumArray
    //
    // Write a method called sumArray that:
    // - Takes an int[] array as a parameter
    // - Returns the sum of all the numbers in the array
    //
    // Example:
    // int[] nums = {1, 2, 3, 4};
    // sumArray(nums) --> 10
    //
    // HINT:
    // - Create an int total = 0;
    // - Loop through the array and add each value to total
    //
    // After finishing:
    // - Test with {1,2,3,4} and {10,-5,2} in main and print results
    //
    // TODO:
    //   1. Replace "return 0;" with the correct code.
    // ============================================================
    public static int sumArray(int[] arr) {
        // TODO:
        // int total = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     total += arr[i];
        // }
        // return total;
        return 0;
    }


    // ============================================================
    // Q2. firstElement
    //
    // Write a method called firstElement that:
    // - Takes an int[] array as a parameter
    // - Returns the first element in that array
    //
    // You can assume the array has at least 1 element.
    //
    // Example:
    // int[] a = {42, 99, 100};
    // firstElement(a) --> 42
    //
    // After finishing:
    // - Make arrays {42, 99, 100} and {5} in main
    // - Print firstElement(...) for each
    //
    // TODO:
    //   1. Replace "return 0;" with the correct code.
    //   2. Use index 0.
    // ============================================================
    public static int firstElement(int[] arr) {
        // TODO: return arr[0];
        return 0;
    }


    // ============================================================
    // Q3. lastElement
    //
    // Write a method called lastElement that:
    // - Takes a String[] array as a parameter
    // - Returns the LAST element in that array
    //
    // HINT:
    // - The last index is array.length - 1
    //
    // Example:
    // String[] words = {"apple", "banana", "cherry"};
    // lastElement(words) --> "cherry"
    //
    // After finishing:
    // - In main test:
    //   {"apple","banana","cherry"}  -> "cherry"
    //   {"hi"} -> "hi"
    //
    // TODO:
    //   1. Replace "return null;" with the correct code.
    // ============================================================
    public static String lastElement(String[] arr) {
        // TODO:
        // int lastIndex = arr.length - 1;
        // return arr[lastIndex];
        return null;
    }


    // ============================================================
    // Q4. countEvens
    //
    // Write a method called countEvens that:
    // - Takes an int[] array as a parameter
    // - Returns how many of the numbers in the array are EVEN
    //
    // Reminder:
    // A number is even if number % 2 == 0
    //
    // Example:
    // int[] z = {2, 5, 8, 11, 14};
    // countEvens(z) --> 3  (2, 8, 14 are even)
    //
    // HINT:
    // - Make a counter: int evens = 0;
    // - Loop through the array
    // - If the current number is even, increase the counter
    //
    // After finishing:
    // - In main test with:
    //   {2,5,8,11,14}  -> 3
    //   {1,3,5}        -> 0
    //
    // TODO:
    //   1. Replace "return 0;" with a loop that counts evens.
    // ============================================================
    public static int countEvens(int[] arr) {
        // TODO:
        // int evens = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] % 2 == 0) {
        //         evens++;
        //     }
        // }
        // return evens;
        return 0;
    }


    // ============================================================
    // Q5. toStringArray
    //
    // Write a method called toStringArray that:
    // - Takes an int[] array as a parameter
    // - Returns a String that looks like this: "[7, 8, 9]"
    //
    // Rules:
    // - The string should start with "[" and end with "]"
    // - Numbers should be separated by ", " (comma + space)
    //
    // Example:
    // int[] demo = {7, 8, 9};
    // toStringArray(demo) --> "[7, 8, 9]"
    //
    // Edge case:
    // If the array has length 0, return "[]"
    //
    // HINT:
    // - Build a String using a loop
    // - Be careful not to put an extra comma at the end
    //
    // After finishing:
    // - In main:
    //   int[] demo = {7, 8, 9};
    //   System.out.println(toStringArray(demo)); // [7, 8, 9]
    //
    // TODO:
    //   1. Replace "return null;" with code that builds the string.
    //   2. Handle the empty array.
    //
    // (Pseudo-idea)
    // if (arr.length == 0) return "[]";
    // Start with result = "["
    // Loop through every element:
    //   add the number
    //   if it's NOT the last number, also add ", "
    // After the loop, add "]"
    // return result
    // ============================================================
    public static String toStringArray(int[] arr) {
        // TODO:
        // if (arr.length == 0) {
        //     return "[]";
        // }
        //
        // String result = "[";
        //
        // for (int i = 0; i < arr.length; i++) {
        //     result += arr[i];
        //
        //     // if not the last element, add comma+space
        //     if (i < arr.length - 1) {
        //         result += ", ";
        //     }
        // }
        //
        // result += "]";
        // return result;
        return null;
    }
}

