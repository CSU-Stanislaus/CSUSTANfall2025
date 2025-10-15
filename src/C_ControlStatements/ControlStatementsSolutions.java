package C_ControlStatements;

import java.util.Scanner;

public class ControlStatementsSolutions {

    public static void main(String[] args) {
        // Tiny demo so you can sanity-check quickly
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Control Statements Solutions (Demo) ===");

        System.out.print("isEven(4)? ");
        System.out.println(isEven(4));

        System.out.print("maxOfTwo(7, 3) -> ");
        System.out.println(maxOfTwo(7, 3));

        System.out.print("gradeLetter(88) -> ");
        System.out.println(gradeLetter(88));

        System.out.print("fizzBuzzOne(15) -> ");
        System.out.println(fizzBuzzOne(15));

        System.out.print("sum1toN(5) -> ");
        System.out.println(sum1toN(5));

        System.out.print("factorial(5) -> ");
        System.out.println(factorial(5));

        System.out.print("reverseString('hello') -> ");
        System.out.println(reverseString("hello"));

        System.out.print("countVowels('Alphabet Soup') -> ");
        System.out.println(countVowels("Alphabet Soup"));

        System.out.println("multiplicationTable(3):\n" + multiplicationTable(3));

        System.out.print("dayNameSwitch(6) -> ");
        System.out.println(dayNameSwitch(6));

        sc.close();
    }

    // Helper from the prompt style (not used in the quick demo, but kept for parity)
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

    /** 1) If/Else: return true if n is even, false if odd. */
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /** 2) If/Else: return the larger of a and b. */
    public static int maxOfTwo(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    /** 3) If/Else-If Ladder with validation. */
    public static String gradeLetter(int score) {
        if (score < 0 || score > 100) {
            return "INVALID";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    /** 4) FizzBuzz logic using if/else. */
    public static String fizzBuzzOne(int n) {
        boolean by3 = (n % 3 == 0);
        boolean by5 = (n % 5 == 0);
        if (by3 && by5) {
            return "FizzBuzz";
        } else if (by3) {
            return "Fizz";
        } else if (by5) {
            return "Buzz";
        } else {
            return Integer.toString(n);
        }
    }

    /** 5) Sum 1..n using a for loop; if n < 1, return 0. */
    public static int sum1toN(int n) {
        if (n < 1) return 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /** 6) Factorial via while; 0! = 1; n < 0 => -1. */
    public static long factorial(int n) {
        if (n < 0) return -1L;
        long result = 1L;
        int i = n;
        while (i > 1) {
            result *= i;
            i--;
        }
        return result; // includes case n==0 => 1
    }

    /** 7) Reverse string with for loop; null-safe. */
    public static String reverseString(String s) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    /** 8) Count vowels (a,e,i,o,u) case-insensitive; null => 0. */
    public static int countVowels(String s) {
        if (s == null) return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            } else {
                continue; // explicit use of continue per challenge
            }
        }
        return count;
    }

    /** 9) Multiplication table 1..10 as multi-line string. */
    public static String multiplicationTable(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
        }
        return sb.toString();
    }

    /** 10) Switch 1..7 => weekday names; else INVALID. */
    public static String dayNameSwitch(int dayNumber) {
        switch (dayNumber) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "INVALID";
        }
    }
}
