# README.md — Java `while` Loop Practice (Single‑File, 10 Simple Exercises)

This repo uses a **single Java file** you can run immediately. A simple menu lets you launch any of the **10** `while`‑loop exercises.

## Quick Start

```bash
# Create a folder, add Main.java with the code below, then compile & run
javac Main.java
java Main
```

---

## Main.java (copy/paste this entire block)

```java
import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("
Java while-loop Practice — Choose an exercise:");
            System.out.println("1) Count Up (0 → N)");
            System.out.println("2) Count Down (N → 0)");
            System.out.println("3) Sum 1..N");
            System.out.println("4) Multiplication Table (x by 1..10)");
            System.out.println("5) Sum Until 0 (sentinel)");
            System.out.println("6) Average Until -1");
            System.out.println("7) Password Prompt (3 attempts)");
            System.out.println("8) Guess the Number (1..50)");
            System.out.println("9) Print Digits (spaces)");
            System.out.println("10) Count Digits");
            System.out.println("0) Exit");

            int choice = readInt("Select: ");
            System.out.println();
            if (choice == 0) break;

            switch (choice) {
                case 1: ex1CountUp(); break;
                case 2: ex2CountDown(); break;
                case 3: ex3SumToN(); break;
                case 4: ex4MultiplicationTable(); break;
                case 5: ex5SumUntilZero(); break;
                case 6: ex6AverageUntilMinus1(); break;
                case 7: ex7PasswordPrompt(); break;
                case 8: ex8GuessNumber(); break;
                case 9: ex9PrintDigits(); break;
                case 10: ex10CountDigits(); break;
                default: System.out.println("Unknown choice. Try again.");
            }
        }
        System.out.println("Goodbye!");
    }

    // ===== Helpers =========================================================
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (Exception e) {
                System.out.println("Invalid integer. Try again.");
            }
        }
    }

    private static int readIntInRange(String prompt, int min, int max) {
        while (true) {
            int v = readInt(prompt);
            if (v >= min && v <= max) return v;
            System.out.println("Enter a value in [" + min + ".." + max + "].");
        }
    }

    private static String readNonEmpty(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine();
            if (s != null && s.trim().length() > 0) return s.trim();
            System.out.println("Input cannot be empty. Try again.");
        }
    }

    // ===== Exercises (simpler focus on while) ==============================

    // 1) Count Up (0 -> N)
    private static void ex1CountUp() {
        int N = readIntInRange("Enter N (>=0): ", 0, Integer.MAX_VALUE);
        int i = 0;
        while (i <= N) {
            System.out.print(i);
            if (i < N) System.out.print(" ");
            i++;
        }
        System.out.println();
    }

    // 2) Count Down (N -> 0)
    private static void ex2CountDown() {
        int N = readIntInRange("Enter N (>=0): ", 0, Integer.MAX_VALUE);
        int i = N;
        while (i >= 0) {
            System.out.print(i);
            if (i > 0) System.out.print(" ");
            i--;
        }
        System.out.println();
    }

    // 3) Sum 1..N
    private static void ex3SumToN() {
        int N = readIntInRange("Enter N (>=1): ", 1, Integer.MAX_VALUE);
        int i = 1, sum = 0;
        while (i <= N) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    // 4) Multiplication Table x * 1..10 (fixed 10 to keep simple)
    private static void ex4MultiplicationTable() {
        int x = readInt("Enter x: ");
        int i = 1;
        while (i <= 10) {
            System.out.println(x + " * " + i + " = " + (x * i));
            i++;
        }
    }

    // 5) Sum Until 0 (sentinel)
    private static void ex5SumUntilZero() {
        System.out.println("Enter integers (0 to stop):");
        int sum = 0;
        while (true) {
            int v = readInt(": ");
            if (v == 0) break;
            sum += v;
        }
        System.out.println("Sum = " + sum);
    }

    // 6) Average Until -1
    private static void ex6AverageUntilMinus1() {
        System.out.println("Enter scores 0..100 (-1 to finish).");
        int count = 0;
        int total = 0;
        while (true) {
            int v = readInt(": ");
            if (v == -1) break;
            if (v < 0 || v > 100) {
                System.out.println("Ignored (out of range)");
                continue;
            }
            total += v;
            count++;
        }
        if (count == 0) System.out.println("No valid scores.");
        else System.out.printf("Average = %.2f%n", (total * 1.0 / count));
    }

    // 7) Password Prompt (3 attempts)
    private static void ex7PasswordPrompt() {
        final String secret = "letmein";
        int attempts = 0;
        boolean ok = false;
        while (attempts < 3 && !ok) {
            String guess = readNonEmpty("Password: ");
            if (guess.equals(secret)) ok = true;
            else {
                attempts++;
                System.out.println("Wrong password.");
            }
        }
        System.out.println(ok ? "Access granted" : "Locked out");
    }

    // 8) Guess the Number (1..50) — simpler range
    private static void ex8GuessNumber() {
        Random rng = new Random();
        int secret = rng.nextInt(50) + 1; // 1..50
        int tries = 0;
        boolean done = false;
        System.out.println("I picked a number in [1,50]. Try to guess it!");
        while (!done) {
            int g = readInt("Your guess: ");
            tries++;
            if (g == secret) {
                System.out.println("Correct in " + tries + " tries!");
                done = true;
            } else if (g < secret) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }
        }
    }

    // 9) Print Digits (spaces) — e.g., 204 -> "2 0 4"
    private static void ex9PrintDigits() {
        int n = readIntInRange("Enter non-negative integer: ", 0, Integer.MAX_VALUE);
        // Handle 0 directly
        if (n == 0) {
            System.out.println("0");
            return;
        }
        // Collect digits in a stack-like list (reverse order), then print forward
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        // print reverse of collected (to preserve original order)
        int i = digits.size() - 1;
        while (i >= 0) {
            System.out.print(digits.get(i));
            if (i > 0) System.out.print(" ");
            i--;
        }
        System.out.println();
    }

    // 10) Count Digits — handle 0 and negatives
    private static void ex10CountDigits() {
        int n = readInt("Enter integer: ");
        if (n == 0) {
            System.out.println(1);
            return;
        }
        if (n < 0) n = -n; // ignore sign for counting
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
```

---

## Notes

* All tasks use **`while`** (plus nested `while` in a few) with simple, beginner‑friendly logic.
* Focus: loop setup, condition, and variable updates.
* Try re‑implementing any 2 tasks using `for` and compare.
