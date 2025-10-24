package D_Methods;

public class MethodsLab5 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // Uncomment lines after writing each method
        // ===========================

        // Q1: square
        // System.out.println("square(4) = " + square(4));
        // System.out.println("square(10) = " + square(10));

        // Q2: average
        // System.out.println("average(5, 10) = " + average(5, 10));
        // System.out.println("average(7, 3) = " + average(7, 3));

        // Q3: greetPerson
        // System.out.println(greetPerson("Liam", 20));
        // System.out.println(greetPerson("Sophia", 35));

        // Q4: repeatWord
        // System.out.println(repeatWord("Hi", 3));
        // System.out.println(repeatWord("Java", 2));

        // Q5: absoluteValue
        // System.out.println("absoluteValue(-5) = " + absoluteValue(-5));
        // System.out.println("absoluteValue(12) = " + absoluteValue(12));
    }

    // ============================================================
    // Q1. square
    //
    // Write a method called square that:
    // - Takes one int parameter: num
    // - Returns the square of that number (num * num)
    //
    // Example:
    // square(4) --> 16
    //
    // After finishing:
    // - Call square(4) and square(10) in main, and print results.
    //
    // TODO: Replace "return 0;" with correct code.
    // ============================================================
    public static int square(int num) {
        // TODO: return num * num;
        return 0;
    }

    // ============================================================
    // Q2. average
    //
    // Write a method called average that:
    // - Takes two double parameters: a and b
    // - Returns their average ((a + b) / 2)
    //
    // Example:
    // average(5, 10) --> 7.5
    //
    // After finishing:
    // - Test average(5,10) and average(7,3) in main.
    //
    // TODO: Replace "return 0;" with correct code.
    // ============================================================
    public static double average(double a, double b) {
        // TODO: return (a + b) / 2;
        return 0;
    }

    // ============================================================
    // Q3. greetPerson
    //
    // Write a method called greetPerson that:
    // - Takes two parameters: a String name and an int age
    // - Returns a message like: "Hello, Liam! You are 20 years old."
    //
    // Example:
    // greetPerson("Liam", 20) --> "Hello, Liam! You are 20 years old."
    //
    // After finishing:
    // - Test greetPerson("Liam", 20) and greetPerson("Sophia", 35)
    //
    // TODO: Replace "return null;" with correct code.
    // ============================================================
    public static String greetPerson(String name, int age) {
        // TODO: return "Hello, " + name + "! You are " + age + " years old.";
        return null;
    }

    // ============================================================
    // Q4. repeatWord
    //
    // Write a method called repeatWord that:
    // - Takes a String word and an int count
    // - Returns the word repeated count times in one line (no spaces)
    //
    // Example:
    // repeatWord("Hi", 3) --> "HiHiHi"
    //
    // HINT:
    // - Use a for loop
    // - Start with an empty String and keep adding word
    //
    // After finishing:
    // - Test repeatWord("Hi", 3) and repeatWord("Java", 2)
    //
    // TODO: Replace "return null;" with correct code.
    // ============================================================
    public static String repeatWord(String word, int count) {
        // TODO:
        // String result = "";
        // for (int i = 0; i < count; i++) {
        //     result += word;
        // }
        // return result;
        return null;
    }

    // ============================================================
    // Q5. absoluteValue
    //
    // Write a method called absoluteValue that:
    // - Takes one int parameter: n
    // - Returns n if it's positive, or -n if it's negative
    //
    // Example:
    // absoluteValue(-5) --> 5
    // absoluteValue(12) --> 12
    //
    // After finishing:
    // - Test absoluteValue(-5) and absoluteValue(12)
    //
    // TODO: Replace "return 0;" with correct code.
    // ============================================================
    public static int absoluteValue(int n) {
        // TODO:
        // if (n < 0) {
        //     return -n;
        // } else {
        //     return n;
        // }
        return 0;
    }
}

