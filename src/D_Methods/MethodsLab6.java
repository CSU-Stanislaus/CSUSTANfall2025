package D_Methods;

public class MethodsLab6 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // Uncomment lines after you write each method
        // ===========================

        // Q1: isAdult
        // System.out.println("isAdult(17) = " + isAdult(17)); // false
        // System.out.println("isAdult(18) = " + isAdult(18)); // true
        // System.out.println("isAdult(25) = " + isAdult(25)); // true

        // Q2: formatMoney
        // System.out.println(formatMoney("Alice", 12.5));
        // System.out.println(formatMoney("Bob", 100.0));

        // Q3: areaOfRectangle
        // System.out.println("areaOfRectangle(5, 4) = " + areaOfRectangle(5, 4));
        // System.out.println("areaOfRectangle(10, 2) = " + areaOfRectangle(10, 2));

        // Q4: firstChar
        // System.out.println("firstChar(\"hello\") = " + firstChar("hello"));
        // System.out.println("firstChar(\"Java\") = " + firstChar("Java"));

        // Q5: toCelsius
        // System.out.println("toCelsius(32) = " + toCelsius(32.0));
        // System.out.println("toCelsius(98.6) = " + toCelsius(98.6));
    }


    // ============================================================
    // Q1. isAdult
    //
    // Write a method called isAdult that:
    // - Takes one int parameter: age
    // - Returns true if age is 18 or higher
    // - Returns false if age is less than 18
    //
    // Examples:
    // isAdult(17) --> false
    // isAdult(18) --> true
    // isAdult(25) --> true
    //
    // After finishing:
    // - Call isAdult(17), isAdult(18), isAdult(25) in main and print them
    //
    // TODO: Replace "return false;" with a boolean check.
    // HINT: Use age >= 18
    // ============================================================
    public static boolean isAdult(int age) {
        // TODO: return age >= 18;
        return false;
    }


    // ============================================================
    // Q2. formatMoney
    //
    // Write a method called formatMoney that:
    // - Takes a String name and a double amount
    // - Returns a sentence like:
    //   "Alice has $12.5"
    //
    // Example:
    // formatMoney("Alice", 12.5) --> "Alice has $12.5"
    //
    // After finishing:
    // - Call formatMoney("Alice", 12.5) in main and print it
    // - Call formatMoney("Bob", 100.0) in main and print it
    //
    // TODO: Replace "return null;" with a String you build.
    // HINT: Use + to build the sentence.
    // ============================================================
    public static String formatMoney(String name, double amount) {
        // TODO: return name + " has $" + amount;
        return null;
    }


    // ============================================================
    // Q3. areaOfRectangle
    //
    // Write a method called areaOfRectangle that:
    // - Takes two int parameters: width and height
    // - Returns the area as an int
    //   (area = width * height)
    //
    // Examples:
    // areaOfRectangle(5, 4) --> 20
    // areaOfRectangle(10, 2) --> 20
    //
    // After finishing:
    // - Call areaOfRectangle(5, 4) and areaOfRectangle(10, 2) in main and print them
    //
    // TODO: Replace "return 0;" with the correct formula.
    // ============================================================
    public static int areaOfRectangle(int width, int height) {
        // TODO: return width * height;
        return 0;
    }


    // ============================================================
    // Q4. firstChar
    //
    // Write a method called firstChar that:
    // - Takes one String parameter: text
    // - Returns the FIRST character of that String
    //
    // Example:
    // firstChar("hello") --> 'h'
    // firstChar("Java")  --> 'J'
    //
    // HINTS:
    // - Use charAt(0) to get the first character of a String
    // - Assume the input String is not empty
    //
    // After finishing:
    // - Call firstChar("hello") and firstChar("Java") in main and print them
    //
    // TODO: Replace "return 'x';" with the correct code.
    // ============================================================
    public static char firstChar(String text) {
        // TODO: return text.charAt(0);
        return 'x';
    }


    // ============================================================
    // Q5. toCelsius
    //
    // Write a method called toCelsius that:
    // - Takes one double parameter: f
    //   (this represents a temperature in degrees Fahrenheit)
    // - Returns a double that is the temperature in Celsius
    //
    // Formula:
    // Celsius = (f - 32) * 5 / 9
    //
    // Examples:
    // toCelsius(32.0)  --> 0.0
    // toCelsius(98.6)  --> 37-ish
    //
    // After finishing:
    // - Call toCelsius(32.0) and toCelsius(98.6) in main and print results
    //
    // TODO: Replace "return 0.0;" with the correct formula.
    // NOTE: Use 5.0 and 9.0 to keep decimal math.
    // ============================================================
    public static double toCelsius(double f) {
        // TODO: return (f - 32) * 5.0 / 9.0;
        return 0.0;
    }
}

