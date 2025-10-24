package E_Arrays;

public class ArraysLab9 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // Uncomment lines after you write each method
        // ===========================

        // Q1: totalLength
        // String[] wordsA = {"hi", "apple", "sun"};
        // String[] wordsB = {"a", "bb", "ccc", "dddd"};
        // System.out.println("totalLength(wordsA) = " + totalLength(wordsA)); // 2+5+3 = 10
        // System.out.println("totalLength(wordsB) = " + totalLength(wordsB)); // 1+2+3+4 = 10

        // Q2: containsValue
        // int[] data1 = {3, 6, 9, 12};
        // int[] data2 = {5, 5, 5};
        // System.out.println("containsValue(data1, 9) = " + containsValue(data1, 9));   // true
        // System.out.println("containsValue(data1, 10) = " + containsValue(data1, 10)); // false
        // System.out.println("containsValue(data2, 5) = " + containsValue(data2, 5));   // true

        // Q3: howManyAbove
        // int[] grades = {70, 85, 90, 60, 100};
        // System.out.println("howManyAbove(grades, 80) = " + howManyAbove(grades, 80)); // 3
        // System.out.println("howManyAbove(grades, 95) = " + howManyAbove(grades, 95)); // 1

        // Q4: copyFirstN
        // int[] numsOriginal = {4, 5, 6, 7, 8};
        // int[] first3 = copyFirstN(numsOriginal, 3);
        // // print result to check: should be 4 5 6
        // for (int i = 0; i < first3.length; i++) {
        //     System.out.print(first3[i] + " ");
        // }
        // System.out.println();

        // Q5: indexOfSmallest
        // int[] arr1 = {9, 4, 11, 2, 8};   // smallest value is 2 at index 3
        // int[] arr2 = {5};                // smallest is 5 at index 0
        // System.out.println("indexOfSmallest(arr1) = " + indexOfSmallest(arr1)); // 3
        // System.out.println("indexOfSmallest(arr2) = " + indexOfSmallest(arr2)); // 0
    }


    // ============================================================
    // Q1. totalLength
    //
    // Write a method called totalLength that:
    // - Takes a String[] array called words
    // - Returns the TOTAL number of characters in all the Strings combined
    //
    // Example:
    // String[] words = {"hi", "apple", "sun"};
    // totalLength(words) --> 10   because "hi"(2) + "apple"(5) + "sun"(3) = 10
    //
    // HINT:
    // - Make an int total = 0;
    // - Loop through the array
    // - For each word, add word.length() to total
    //
    // After finishing:
    // - Test with {"hi","apple","sun"} and {"a","bb","ccc","dddd"}
    //
    // TODO:
    //   1. Replace "return 0;" with a loop that adds up .length().
    // ============================================================
    public static int totalLength(String[] words) {
        // TODO:
        // int total = 0;
        // for (int i = 0; i < words.length; i++) {
        //     total += words[i].length();
        // }
        // return total;
        return 0;
    }


    // ============================================================
    // Q2. containsValue
    //
    // Write a method called containsValue that:
    // - Takes an int[] array and an int target
    // - Returns true if the target appears anywhere in the array
    // - Returns false if not
    //
    // Example:
    // int[] data = {3, 6, 9, 12};
    // containsValue(data, 9)  --> true
    // containsValue(data, 10) --> false
    //
    // HINT:
    // - Loop over each element
    // - If you ever see target, return true immediately
    // - If you finish the whole loop and don't find it, return false
    //
    // After finishing:
    // - Test with {3,6,9,12} (target 9 and 10)
    // - Test with {5,5,5} (target 5)
    //
    // TODO:
    //   1. Replace "return false;" with correct logic.
    // ============================================================
    public static boolean containsValue(int[] arr, int target) {
        // TODO:
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == target) {
        //         return true;
        //     }
        // }
        // return false;
        return false;
    }


    // ============================================================
    // Q3. howManyAbove
    //
    // Write a method called howManyAbove that:
    // - Takes an int[] array (like grades)
    // - Takes an int limit
    // - Returns how many numbers in the array are STRICTLY greater than limit
    //
    // Example:
    // int[] grades = {70, 85, 90, 60, 100};
    // howManyAbove(grades, 80) --> 3  (85, 90, 100)
    // howManyAbove(grades, 95) --> 1  (100 only)
    //
    // HINT:
    // - Make a counter
    // - Loop through the array
    // - If arr[i] > limit, increase the counter
    //
    // After finishing:
    // - Test with {70,85,90,60,100} and limits 80 and 95
    //
    // TODO:
    //   1. Replace "return 0;" with a working loop.
    // ============================================================
    public static int howManyAbove(int[] arr, int limit) {
        // TODO:
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > limit) {
        //         count++;
        //     }
        // }
        // return count;
        return 0;
    }


    // ============================================================
    // Q4. copyFirstN
    //
    // Write a method called copyFirstN that:
    // - Takes an int[] array called arr
    // - Takes an int n
    // - Returns a NEW int[] containing only the first n elements of arr
    //
    // Example:
    // int[] nums = {4, 5, 6, 7, 8};
    // copyFirstN(nums, 3) --> {4, 5, 6}
    //
    // You may ASSUME:
    // - n will be >= 0
    // - n will be <= arr.length
    //
    // HINT:
    // - Make a new array of length n
    // - Copy arr[0] into newArr[0], arr[1] into newArr[1], etc.
    //
    // After finishing:
    // - In main:
    //   int[] numsOriginal = {4,5,6,7,8};
    //   int[] first3 = copyFirstN(numsOriginal, 3);
    //   Print first3 using a for loop to check: should print "4 5 6"
    //
    // TODO:
    //   1. Replace "return null;" with a new array and a loop.
    // ============================================================
    public static int[] copyFirstN(int[] arr, int n) {
        // TODO:
        // int[] result = new int[n];
        // for (int i = 0; i < n; i++) {
        //     result[i] = arr[i];
        // }
        // return result;
        return null;
    }


    // ============================================================
    // Q5. indexOfSmallest
    //
    // Write a method called indexOfSmallest that:
    // - Takes an int[] array
    // - Finds the SMALLEST value in the array
    // - Returns the INDEX where that smallest value lives
    //
    // Example:
    // int[] arr1 = {9, 4, 11, 2, 8};
    // indexOfSmallest(arr1) --> 3   (because 2 is the smallest, and it's at index 3)
    //
    // If there is only one element in the array, return 0.
    //
    // HINT:
    // - Track two things:
    //   1) The current smallest value we've seen
    //   2) The index where we saw it
    //
    // Steps:
    // - Start with:
    //     int minValue = arr[0];
    //     int minIndex = 0;
    // - Loop from i = 1 to end:
    //     if arr[i] is smaller than minValue:
    //         update minValue and minIndex
    // - After loop, return minIndex
    //
    // After finishing:
    // - Test with {9,4,11,2,8}  (should be 3)
    // - Test with {5}          (should be 0)
    //
    // TODO:
    //   1. Replace "return 0;" with correct logic that tracks min index.
    // ============================================================
    public static int indexOfSmallest(int[] arr) {
        // TODO:
        // int minValue = arr[0];
        // int minIndex = 0;
        //
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] < minValue) {
        //         minValue = arr[i];
        //         minIndex = i;
        //     }
        // }
        //
        // return minIndex;
        return 0;
    }
}

