package C_ControlStatements;

import java.util.Scanner;

public class ControlStatementsLab3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Control Statements Challenge ===");

        // 1) isEven (if/else)
        System.out.print("1) Enter an integer to test even/odd: ");
        int n1 = readInt(sc);
        System.out.println("   isEven? " + isEven(n1));

        // 2) maxOfTwo (if/else)
        System.out.print("2) Enter two integers (a then b) to find the max:\n   a = ");
        int a = readInt(sc);
        System.out.print("   b = ");
        int b = readInt(sc);
        System.out.println("   max: " + maxOfTwo(a, b));

        // 3) gradeLetter (if/else-if ladder)
        System.out.print("3) Enter a score (0-100) to get letter grade: ");
        int score = readInt(sc);
        System.out.println("   letter grade: " + gradeLetter(score));

        // 4) fizzBuzzOne (if/else with %)
        System.out.print("4) Enter an integer for FizzBuzz (single value): ");
        int fb = readInt(sc);
        System.out.println("   result: " + fizzBuzzOne(fb));

        // 5) sum1toN (for loop)
        System.out.print("5) Enter n to sum from 1..n: ");
        int n = readInt(sc);
        System.out.println("   sum 1..n: " + sum1toN(n));

        // 6) factorial (while loop)
        System.out.print("6) Enter n to compute n! (while loop): ");
        int nf = readInt(sc);
        System.out.println("   n! = " + factorial(nf));

        // 7) reverseString (for loop over indices)
        System.out.print("7) Enter text to reverse: ");
        String toReverse = sc.nextLine();
        System.out.println("   reversed: " + reverseString(toReverse));

        // 8) countVowels (loop + continue)
        System.out.print("8) Enter text to count vowels: ");
        String vowelStr = sc.nextLine();
        System.out.println("   vowel count: " + countVowels(vowelStr));

        // 9) multiplicationTable (nested loops; return as multi-line string)
        System.out.print("9) Enter an integer for its 1..10 multiplication table: ");
        int mt = readInt(sc);
        System.out.println(multiplicationTable(mt));

        // 10) dayNameSwitch (switch)
        System.out.print("10) Enter a number 1-7 (1=Mon ... 7=Sun): ");
        int dayNum = readInt(sc);
        System.out.println("   day: " + dayNameSwitch(dayNum));

        System.out.println("=== Done. Now implement the TODOs! ===");
        sc.close();
    }

    // Helper: robust integer reader reused from your style
    private static int readInt(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer: ");
            }
        }
    }

    /**
     * 1) If/Else: return true if n is even, false if odd.
     * Edge: works for negatives too.
     */
    public static boolean isEven(int n) {
        // TODO: Use if/else with n % 2 to determine evenness
        return false;
    }

    /**
     * 2) If/Else: return the larger of a and b.
     * If equal, return either.
     */
    public static int maxOfTwo(int a, int b) {
        // TODO: Use if/else to compare and return the max
        return 0;
    }

    /**
     * 3) If/Else-If Ladder:
     * 90-100 -> "A", 80-89 -> "B", 70-79 -> "C", 60-69 -> "D", else -> "F".
     * For invalid scores (<0 or >100), return "INVALID".
     */
    public static String gradeLetter(int score) {
        // TODO: Implement the ladder and input validation
        return null;
    }

    /**
     * 4) If/Else with mod:
     * "FizzBuzz" if n % 3 == 0 and n % 5 == 0,
     * "Fizz" if only divisible by 3,
     * "Buzz" if only divisible by 5,
     * otherwise the number itself as a string.
     */
    public static String fizzBuzzOne(int n) {
        // TODO: Implement FizzBuzz logic with if/else
        return null;
    }

    /**
     * 5) For Loop:
     * Return the sum of integers from 1 to n.
     * If n < 1, return 0.
     */
    public static int sum1toN(int n) {
        // TODO: Use a for loop to accumulate the sum
        return 0;
    }

    /**
     * 6) While Loop:
     * Return n! (factorial). By convention, 0! = 1.
     * If n < 0, return -1 to signal "not defined".
     */
    public static long factorial(int n) {
        // TODO: Use a while loop to multiply down to 1
        return 0L;
    }

    /**
     * 7) For Loop over indices:
     * Return the reverse of the input string.
     * If s is null, return null.
     */
    public static String reverseString(String s) {
        // TODO: Build a reversed string using a for loop from end->start
        return null;
    }

    /**
     * 8) Loop + continue:
     * Count vowels (a, e, i, o, u) in the string, case-insensitive.
     * If s is null, return 0.
     */
    public static int countVowels(String s) {
        // TODO: Loop through characters; use continue for non-vowels
        return 0;
    }

    /**
     * 9) Nested Loops (simple table, 1..10):
     * Return a multi-line string:
     * "n x 1 = ...\n n x 2 = ...\n ... n x 10 = ...\n"
     * Example for n=3:
     * 3 x 1 = 3
     * 3 x 2 = 6
     * ...
     */
    public static String multiplicationTable(int n) {
        // TODO: Use a loop from 1 to 10 and build the lines
        return null;
    }

    /**
     * 10) Switch:
     * 1->"Monday", 2->"Tuesday", ..., 7->"Sunday".
     * For anything else return "INVALID".
     */
    public static String dayNameSwitch(int dayNumber) {
        // TODO: Implement switch statement
        return null;
    }
}