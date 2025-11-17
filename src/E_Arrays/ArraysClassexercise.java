package E_Arrays;/*
    =====================================================
                INTRODUCTION TO ARRAYS – ASSIGNMENT
    =====================================================

    -------------------------
    TEACHING NOTES
    -------------------------

    1. What Is an Array?
       - An array is a data structure that stores multiple values
         of the same type in a single variable.
       - Each value is called an element.
       - Each element has an index (starting at 0 in Java).

       Example:
           int[] numbers = {10, 20, 30, 40};
           numbers[0] -> 10
           numbers[3] -> 40
           numbers.length -> 4

    2. Why Use Arrays?
       - Store many related values easily.
       - Efficient when working with loops and algorithms.
       - Easier to manage than multiple separate variables.

    3. Ways to Declare Arrays:
       A. Declare now, assign later:
           int[] scores = new int[5];

       B. Declare and assign immediately:
           String[] names = {"Tom", "Joy", "Sam"};

    4. Accessing Elements:
           System.out.println(names[1]); // prints "Joy"

    5. Changing Values:
           names[2] = "David";

    6. Looping Through Arrays:
       A. Standard for-loop:
           for (int i = 0; i < numbers.length; i++) {
               System.out.println(numbers[i]);
           }

       B. Enhanced for-loop:
           for (int n : numbers) {
               System.out.println(n);
           }

    7. Common Array Errors:
       - Accessing an index that does not exist (out-of-bounds).
       - Mixing data types.
       - Forgetting that arrays are fixed-size once created.


    =====================================================
                CLASS EXERCISES
    =====================================================

    EXERCISE 1 — Basic Array Access
    --------------------------------
    Create an array with the numbers 5, 10, 15, 20, 25.
    Print:
       1. The first element
       2. The last element
       3. The length of the array


    EXERCISE 2 — Fill an Empty Array
    --------------------------------
    Create an empty array of 5 integers.
    Use a loop to fill it with multiples of 3:
       0, 3, 6, 9, 12
    Then print all the values.


    EXERCISE 3 — Sum of Array Elements
    ----------------------------------
    Write a program that:
       - Creates an integer array
       - Loops through it
       - Computes the sum of all its elements


    EXERCISE 4 — Find the Largest Number
    -------------------------------------
    Given:
        int[] nums = {3, 14, 7, 29, 5};
    Write code to find the largest number in the array.


    EXERCISE 5 — Counting Specific Elements
    ---------------------------------------
    Create a String array of colors:
        {"Red", "Blue", "Red", "Green", "Red"}
    Count how many times "Red" appears.


    EXERCISE 6 — Reverse an Array
    ------------------------------
    Print an array backwards.
    Example input:
        {10, 20, 30, 40, 50}
    Example output:
        50 40 30 20 10


    EXERCISE 7 — User Input Into Arrays (Optional)
    ----------------------------------------------
    Ask the user for 5 names.
    Store them in a String array.
    Then print all the names entered.


    EXERCISE 8 — Average of Numbers
    --------------------------------
    Compute the average of the numbers in an array.


    EXERCISE 9 — Replace Negative Numbers
    -------------------------------------
    Given:
        int[] data = {4, -2, 9, -5, 12};
    Replace all negative numbers with 0.


    EXERCISE 10 — Simple Grades Program
    -----------------------------------
    Create an array of 6 student scores.
    Calculate:
       - Highest score
       - Lowest score
       - Average score


    =====================================================
                STUDENT WORKSPACE BELOW
    =====================================================

*/

public class ArraysClassexercise {

    public static void main(String[] args) {
        // Write your code here for the exercises.
    }

}
