package D_Methods;

public class MethodsLab4 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // Call your methods and print the results
        // ===========================

        // Example tests (uncomment after you write the methods):

        // Q1: greet
        // String msg1 = greet("Ava");
        // String msg2 = greet("Professor");
        // System.out.println("greet(\"Ava\") = " + msg1);
        // System.out.println("greet(\"Professor\") = " + msg2);

        // Q2: add
        // int sum1 = add(2, 3);
        // int sum2 = add(100, 400);
        // System.out.println("add(2, 3) = " + sum1);
        // System.out.println("add(100, 400) = " + sum2);

        // Q3: max
        // int m1 = max(10, 4);
        // int m2 = max(9, 9);
        // System.out.println("max(10, 4) = " + m1);
        // System.out.println("max(9, 9) = " + m2);

        // Q4: fullName
        // String name1 = fullName("Taylor", "Swift");
        // String name2 = fullName("Bruce", "Wayne");
        // System.out.println("fullName(\"Taylor\", \"Swift\") = " + name1);
        // System.out.println("fullName(\"Bruce\", \"Wayne\") = " + name2);

        // Q5: isEven
        // boolean even1 = isEven(8);
        // boolean even2 = isEven(13);
        // System.out.println("isEven(8) = " + even1);
        // System.out.println("isEven(13) = " + even2);

        // ⭐ EXTRA (optional)
        // String shout1 = shout("stop");
        // String shout2 = shout("hello world");
        // System.out.println("shout(\"stop\") = " + shout1);
        // System.out.println("shout(\"hello world\") = " + shout2);
    }


    // ============================================================
    // Q1. greet
    //
    // Write a method called greet that:
    // - Takes one String parameter called name
    // - Returns a String that says "Hello, <name>!"
    //
    // Example:
    // greet("Ava")  --> "Hello, Ava!"
    //
    // After you finish this method:
    // - Call it in main
    // - Save the result into a variable
    // - Print it using System.out.println(...)
    //
    // TODO:
    //   1. Replace "return null;" with the correct code.
    // ============================================================
    public static String greet(String name) {
        // TODO: return "Hello, " + name + "!";
        return null;
    }


    // ============================================================
    // Q2. add
    //
    // Write a method called add that:
    // - Takes two int parameters: a and b
    // - Returns the sum (a + b) as an int
    //
    // Example:
    // add(5, 7) --> 12
    //
    // After you finish this method:
    // - Call add(2, 3) in main and print it
    // - Call add(100, 400) in main and print it
    //
    // TODO:
    //   1. Replace "return 0;" with the correct code.
    // ============================================================
    public static int add(int a, int b) {
        // TODO: return a + b;
        return 0;
    }


    // ============================================================
    // Q3. max
    //
    // Write a method called max that:
    // - Takes two int parameters: x and y
    // - Returns the BIGGER of the two numbers
    //
    // Examples:
    // max(10, 4) --> 10
    // max(9, 9)  --> 9  (either one is fine if they are equal)
    //
    // Hints:
    // - Use if/else
    // - Compare x and y
    //
    // After you finish this method:
    // - Call it in main and print max(10, 4)
    // - Call it in main and print max(9, 9)
    //
    // TODO:
    //   1. Write an if/else that returns x if x is >= y,
    //      otherwise returns y.
    // ============================================================
    public static int max(int x, int y) {
        // TODO:
        // if (x >= y) {
        //     return x;
        // } else {
        //     return y;
        // }
        return 0;
    }


    // ============================================================
    // Q4. fullName
    //
    // Write a method called fullName that:
    // - Takes two String parameters: first and last
    // - Returns first + " " + last
    //
    // Example:
    // fullName("Taylor", "Swift") --> "Taylor Swift"
    //
    // After you finish this method:
    // - Call it in main and print fullName("Taylor", "Swift")
    // - Call it in main and print fullName("Bruce", "Wayne")
    //
    // TODO:
    //   1. Replace "return null;" with code that joins first name,
    //      a space, and last name.
    // ============================================================
    public static String fullName(String first, String last) {
        // TODO: return first + " " + last;
        return null;
    }


    // ============================================================
    // Q5. isEven
    //
    // Write a method called isEven that:
    // - Takes one int parameter: n
    // - Returns true if n is even
    // - Returns false if n is odd
    //
    // HINT:
    // - A number is even if n % 2 == 0
    //
    // Examples:
    // isEven(8)  --> true
    // isEven(13) --> false
    //
    // After you finish this method:
    // - In main, print isEven(8)
    // - In main, print isEven(13)
    //
    // TODO:
    //   1. Replace "return false;" with the correct boolean expression.
    // ============================================================
    public static boolean isEven(int n) {
        // TODO: return n % 2 == 0;
        return false;
    }


    // ============================================================
    // ⭐ EXTRA CREDIT (Optional)
    //
    // Write a method called shout that:
    // - Takes one String parameter: text
    // - Returns the same text in ALL CAPS
    //   plus an exclamation mark at the end.
    //
    // Example:
    // shout("stop")        --> "STOP!"
    // shout("hello world") --> "HELLO WORLD!"
    //
    // After you finish this method:
    // - Call shout("stop") in main and print it
    // - Call shout("hello world") in main and print it
    //
    // TODO:
    //   1. Replace "return null;" with code that:
    //      - Turns text to upper case
    //      - Adds "!" at the end
    //
    //   HINT: text.toUpperCase()
    // ============================================================
    public static String shout(String text) {
        // TODO: return text.toUpperCase() + "!";
        return null;
    }
}

