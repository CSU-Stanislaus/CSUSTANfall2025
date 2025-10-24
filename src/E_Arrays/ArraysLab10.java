package E_Arrays;

public class ArraysLab10 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // Uncomment lines after you write each method
        // ===========================

        // Q1: multiplyAll
        // int[] m1 = {2, 3, 4};       // 2*3*4 = 24
        // int[] m2 = {5, 1, -2};      // 5*1*(-2) = -10
        // System.out.println("multiplyAll(m1) = " + multiplyAll(m1));
        // System.out.println("multiplyAll(m2) = " + multiplyAll(m2));

        // Q2: countMatches
        // String[] animals = {"cat", "dog", "cat", "bird", "cat"};
        // System.out.println("countMatches(animals, \"cat\") = " + countMatches(animals, "cat")); // 3
        // System.out.println("countMatches(animals, \"dog\") = " + countMatches(animals, "dog")); // 1
        // System.out.println("countMatches(animals, \"lion\") = " + countMatches(animals, "lion")); // 0

        // Q3: isSortedAscending
        // int[] s1 = {1, 2, 3, 4};      // true
        // int[] s2 = {2, 2, 5, 9};      // true (equal neighbors allowed)
        // int[] s3 = {3, 2, 5, 6};      // false (3 -> 2 goes down)
        // System.out.println("isSortedAscending(s1) = " + isSortedAscending(s1));
        // System.out.println("isSortedAscending(s2) = " + isSortedAscending(s2));
        // System.out.println("isSortedAscending(s3) = " + isSortedAscending(s3));

        // Q4: findMax
        // int[] grades = {70, 85, 90, 60, 100};
        // int[] single = {42};
        // System.out.println("findMax(grades) = " + findMax(grades)); // 100
        // System.out.println("findMax(single) = " + findMax(single)); // 42

        // Q5: makeFilledArray
        // int[] filledA = makeFilledArray(5, 9); // {9,9,9,9,9}
        // int[] filledB = makeFilledArray(3, -1); // {-1,-1,-1}
        // // Print arrays to check:
        // for (int i = 0; i < filledA.length; i++) {
        //     System.out.print(filledA[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < filledB.length; i++) {
        //     System.out.print(filledB[i] + " ");
        // }
        // System.out.println();
    }


    // ============================================================
    // Q1. multiplyAll
    //
    // Write a method called multiplyAll that:
    // - Takes an int[] array called nums
    // - Returns the product of ALL values multiplied together
    //
    // Example:
    // nums = {2, 3, 4}  -> 2 * 3 * 4 = 24
    //
    // HINT:
    // - Start with int product = 1;
    // - Loop through each number and multiply it into product
    //
    // After finishing:
    // - Test with {2,3,4} and {5,1,-2}
    //
    // TODO:
    //   1. Replace "return 0;" with correct code.
    // ============================================================
    public static int multiplyAll(int[] nums) {
        // TODO:
        // int product = 1;
        // for (int i = 0; i < nums.length; i++) {
        //     product = product * nums[i];
        // }
        // return product;
        return 0;
    }


    // ============================================================
    // Q2. countMatches
    //
    // Write a method called countMatches that:
    // - Takes a String[] array called arr
    // - Takes a String called target
    // - Returns how many times target appears in arr
    //
    // Example:
    // arr = {"cat","dog","cat","bird","cat"}
    // countMatches(arr, "cat") --> 3
    //
    // HINT:
    // - Use .equals(...) to compare Strings
    // - Make a counter and increase it whenever you find a match
    //
    // After finishing:
    // - Test with "cat", "dog", and "lion"
    //
    // TODO:
    //   1. Replace "return 0;" with a working loop that counts matches.
    // ============================================================
    public static int countMatches(String[] arr, String target) {
        // TODO:
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i].equals(target)) {
        //         count++;
        //     }
        // }
        // return count;
        return 0;
    }


    // ============================================================
    // Q3. isSortedAscending
    //
    // Write a method called isSortedAscending that:
    // - Takes an int[] array called nums
    // - Returns true if the array is in NON-DECREASING order
    //   (that means each number is >= the one before it)
    // - Returns false if it ever goes down
    //
    // Examples:
    // {1,2,3,4}      -> true
    // {2,2,5,9}      -> true (equal is okay)
    // {3,2,5,6}      -> false (3 -> 2 goes DOWN)
    //
    // HINT:
    // - Loop from index 1 to the end
    // - Compare nums[i] to nums[i-1]
    // - If nums[i] < nums[i-1], it's NOT sorted
    //
    // After finishing:
    // - Test with {1,2,3,4}, {2,2,5,9}, and {3,2,5,6}
    //
    // TODO:
    //   1. Replace "return false;" with code that checks sorting.
    // ============================================================
    public static boolean isSortedAscending(int[] nums) {
        // TODO:
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] < nums[i - 1]) {
        //         return false;
        //     }
        // }
        // return true;
        return false;
    }


    // ============================================================
    // Q4. findMax
    //
    // Write a method called findMax that:
    // - Takes an int[] array called nums
    // - Returns the LARGEST value in the array
    //
    // You may assume:
    // - nums has at least 1 element
    //
    // Example:
    // {70, 85, 90, 60, 100} -> 100
    // {42} -> 42
    //
    // HINT:
    // - Start with int max = nums[0];
    // - Loop through the rest of the array
    // - If nums[i] > max, update max
    //
    // After finishing:
    // - Test with {70,85,90,60,100} and {42}
    //
    // TODO:
    //   1. Replace "return 0;" with code that finds the max.
    // ============================================================
    public static int findMax(int[] nums) {
        // TODO:
        // int max = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] > max) {
        //         max = nums[i];
        //     }
        // }
        // return max;
        return 0;
    }


    // ============================================================
    // Q5. makeFilledArray
    //
    // Write a method called makeFilledArray that:
    // - Takes an int length
    // - Takes an int value
    // - Returns a NEW int[] of that length
    //   where EVERY element is set to value
    //
    // Examples:
    // makeFilledArray(5, 9)   -> {9, 9, 9, 9, 9}
    // makeFilledArray(3, -1)  -> {-1, -1, -1}
    //
    // HINT:
    // - Create a new array:
    //     int[] result = new int[length];
    // - Use a loop to fill every slot with value
    //
    // After finishing:
    // - In main:
    //   int[] filledA = makeFilledArray(5, 9);
    //   int[] filledB = makeFilledArray(3, -1);
    //   Print them with a for loop to confirm.
    //
    // TODO:
    //   1. Replace "return null;" with code that builds and fills the array.
    // ============================================================
    public static int[] makeFilledArray(int length, int value) {
        // TODO:
        // int[] result = new int[length];
        // for (int i = 0; i < length; i++) {
        //     result[i] = value;
        // }
        // return result;
        return null;
    }
}

