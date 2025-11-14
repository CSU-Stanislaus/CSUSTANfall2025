package D_Methods;

// NumberUtils.java
// Students: fill in the three methods below.

import java.math.BigInteger;

public class NumberUtils {

    /**
     * Print whether n is odd or even.
     * Expected output examples:
     *   "5 is odd"
     *   "10 is even"
     */
    public static void printOddOrEven(long n) {
        // TODO: implement this method
        System.out.println(n + " -> TODO: print odd or even");
    }

    /**
     * Print whether n is prime or not.
     * For n <= 1 print "<n> is not prime".
     * Expected output examples:
     *   "7 is prime"
     *   "1 is not prime"
     */
    public static void printPrimeOrNot(long n) {
        // TODO: implement this method
        System.out.println(n + " -> TODO: print prime or not");
    }

    /**
     * Compute and print n! (factorial).
     * If n < 0 print an appropriate message.
     * Use BigInteger if you want to support large n.
     * Expected output example:
     *   "5! = 120"
     */
    public static void printFactorial(long n) {
        // TODO: implement this method
        System.out.println(n + " -> TODO: print factorial");
    }

    /** Simple test driver that calls the three methods for several values. */
    public static void main(String[] args) {
        long[] tests;
        if (args.length > 0) {
            tests = new long[args.length];
            for (int i = 0; i < args.length; i++) {
                try {
                    tests[i] = Long.parseLong(args[i]);
                } catch (NumberFormatException e) {
                    tests[i] = 0;
                }
            }
        } else {
            tests = new long[] { -1, 0, 1, 2, 3, 4, 5, 10, 17 };
        }

        for (long t : tests) {
            System.out.println("---- Test " + t + " ----");
            printOddOrEven(t);
            printPrimeOrNot(t);
            printFactorial(t);
            System.out.println();
        }

        System.out.println("Students: implement the TODOs and re-run.");
    }
}
