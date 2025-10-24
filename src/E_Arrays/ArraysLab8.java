package E_Arrays;

public class ArraysLab8 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // Uncomment lines after you write each method
        // ===========================

        // Q1: findIndex
        // int[] data1 = {5, 10, 15, 20};
        // int[] data2 = {7, 7, 7};
        // System.out.println("findIndex(data1, 15) = " + findIndex(data1, 15)); // 2
        // System.out.println("findIndex(data1, 99) = " + findIndex(data1, 99)); // -1
        // System.out.println("findIndex(data2, 7) = " + findIndex(data2, 7));   // 0

        // Q2: minValue
        // int[] numsA = {9, 4, 11, 2, 8};
        // int[] numsB = {5};
        // System.out.println("minValue(numsA) = " + minValue(numsA)); // 2
        // System.out.println("minValue(numsB) = " + minValue(numsB)); // 5

        // Q3: allPositive
        // int[] p1 = {1, 2, 3};
        // int[] p2 = {5, -1, 10};
        // System.out.println("allPositive(p1) = " + allPositive(p1)); // true
        // System.out.println("allPositive(p2) = " + allPositive(p2)); // false

        // Q4: joinWords
        // String[] pets = {"cat", "dog", "bird"};
        // String[] one = {"solo"};
        // System.out.println("joinWords(pets) = " + joinWords(pets)); // "cat dog bird"
        // System.out.println("joinWords(one) = " + joinWords(one));   // "solo"

        // Q5: reverseArray
        // int[] original = {10, 20, 30};
        // int[] reversed = reverseArray(original);
        // // print reversed to check:
        // for (int i = 0; i < reversed.length; i++) {
        //     System.out.print(reversed[i] + " ");
        // }
        // System.out.println(); // new line after loop
    }


    // ============================================================
    // Q1. findIndex
    //
    // Write a method called findIndex that:
    // - Takes an int[] array and an int target
    // - Returns the index of the FIRST time target appears
    // - If target is not found, return -1
    //
    // Examples:
    // int[] data = {5, 10, 15, 20};
    // findIndex(data, 15) --> 2
    // findIndex(data, 99) --> -1
    //
    // HINT:
    // - Loop through the array using i from 0 to arr.length-1
    // - If arr[i] == target, return i immediately
    //
    // After finishing:
    // - Test with {5,10,15,20} and targets 15, 99
    // - Also test with {7,7,7} and target 7 (should be index 0)
    //
    // TODO:
    //   1. Replace "return -1;" with a working loop.
    // ============================================================
    public static int findIndex(int[] arr, int target) {
        // TODO:
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == target) {
        //         return i;
        //     }
        // }
        // return -1;
        return -1;
    }


    // ============================================================
    // Q2. minValue
    //
    // Write a method called minValue that:
    // - Takes an int[] array
    // - Returns the SMALLEST value in the array
    //
    // You may assume the array has at least 1 element.
    //
    // Examples:
    // int[] nums = {9, 4, 11, 2, 8};
    // minValue(nums) --> 2
    //
    // HINT:
    // - Start with int min = arr[0];
    // - Loop through the rest of the array
    // - If you find something smaller, update min
    //
    // After finishing:
    // - Test with {9,4,11,2,8} and {5}
    //
    // TODO:
    //   1. Replace "return 0;" with correct code.
    // ============================================================
    public static int minValue(int[] arr) {
        // TODO:
        // int min = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] < min) {
        //         min = arr[i];
        //     }
        // }
        // return min;
        return 0;
    }


    // ============================================================
    // Q3. allPositive
    //
    // Write a method called allPositive that:
    // - Takes an int[] array
    // - Returns true if EVERY number in the array is > 0
    // - Returns false if ANY number is 0 or negative
    //
    // Examples:
    // int[] p1 = {1, 2, 3};
    // allPositive(p1) --> true
    //
    // int[] p2 = {5, -1, 10};
    // allPositive(p2) --> false (because -1 is not positive)
    //
    // HINT:
    // - Loop through the array
    // - If you see a value <= 0, return false immediately
    // - If you finish the loop with no problems, return true
    //
    // After finishing:
    // - Test with {1,2,3} and {5,-1,10}
    //
    // TODO:
    //   1. Replace "return false;" with the real logic.
    // ============================================================
    public static boolean allPositive(int[] arr) {
        // TODO:
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] <= 0) {
        //         return false;
        //     }
        // }
        // return true;
        return false;
    }


    // ============================================================
    // Q4. joinWords
    //
    // Write a method called joinWords that:
    // - Takes a String[] array
    // - Returns ONE String that has all the words joined with a space " "
    //
    // Examples:
    // String[] pets = {"cat", "dog", "bird"};
    // joinWords(pets) --> "cat dog bird"
    //
    // String[] one = {"solo"};
    // joinWords(one) --> "solo"
    //
    // Edge case:
    // - If the array is empty (length 0), return "" (empty string)
    //
    // HINT:
    // - Use a loop to build up a result String
    // - Add a space " " between words, but not at the very end
    //
    // After finishing:
    // - Test with {"cat","dog","bird"} and {"solo"}
    //
    // TODO:
    //   1. Replace "return null;" with working code.
    //   2. Handle empty array.
    //
    // Pseudo-idea:
    // if (arr.length == 0) {
    //     return "";
    // }
    // Start: String result = "";
    // Loop:
    //   Add the word
    //   If it's not the last word, also add " "
    // ============================================================
    public static String joinWords(String[] arr) {
        // TODO:
        // if (arr.length == 0) {
        //     return "";
        // }
        //
        // String result = "";
        // for (int i = 0; i < arr.length; i++) {
        //     result += arr[i];
        //     if (i < arr.length - 1) {
        //         result += " ";
        //     }
        // }
        // return result;
        return null;
    }


    // ============================================================
    // Q5. reverseArray
    //
    // Write a method called reverseArray that:
    // - Takes an int[] array
    // - Returns a NEW int[] that has the same numbers but in reverse order
    //
    // Example:
    // int[] original = {10, 20, 30};
    // reverseArray(original) --> {30, 20, 10}
    //
    // IMPORTANT:
    // - Do NOT just print it. You must RETURN the new array.
    // - Do NOT modify the original array.
    //
    // HINT:
    // - Make a new int[] with the same length
    // - Example:
    //   int[] result = new int[arr.length];
    // - The first element of result should be the last element of arr
    //   result[0] = arr[arr.length - 1];
    // - The second element of result should be the second-to-last, etc.
    //
    // After finishing:
    // - In main:
    //   int[] original = {10,20,30};
    //   int[] reversed = reverseArray(original);
    //   Print reversed using a for loop.
    //
    // TODO:
    //   1. Replace "return null;" with code that builds the reversed array.
    //
    // Pseudo-idea:
    // int[] result = new int[arr.length];
    // for (int i = 0; i < arr.length; i++) {
    //     result[i] = arr[arr.length - 1 - i];
    // }
    // return result;
    // ============================================================
    public static int[] reverseArray(int[] arr) {
        // TODO:
        // int[] result = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     result[i] = arr[arr.length - 1 - i];
        // }
        // return result;
        return null;
    }
}

