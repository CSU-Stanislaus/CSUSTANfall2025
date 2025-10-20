package B_IntroToJava;

import java.util.Scanner;

public class StringManipulationChallenge {
    //Can you see this
    // test comment
    // test comment
    public static void main(String[] args) {
        /*
         * This main method is ready for you to test your implementations.
         * Fill in the TODOs in the methods below, then run this program and
         * try different inputs to verify behavior.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("=== String Manipulation Challenge ===");
        // 1) Upper / Lower / Trim
        System.out.print("Enter some text: ");
        String input = sc.nextLine();

        String upper = stringToUpper(input);
        System.out.println("UPPER: " + upper);

        String lower = stringToLower(input);
        System.out.println("lower: " + lower);

        System.out.print("Enter text with extra spaces (e.g., '   hello world   '): ");
        String spaced = sc.nextLine();
        String trimmed = stringTrim(spaced);
        System.out.println("trim : '" + trimmed + "'");

        // 2) Substring
        System.out.print("Enter a string to take a substring from: ");
        String subSource = sc.nextLine();
        System.out.print("Enter start index (int): ");
        int start = readInt(sc);
        System.out.print("Enter substring length (int): ");
        int len = readInt(sc);

        try {
            String sub = stringSubstring(subSource, start, len);
            System.out.println("substring: " + sub);
        } catch (Exception e) {
            System.out.println("substring: ERROR -> " + e.getMessage());
        }

        // 3) Search char
        System.out.print("Enter a string to search in: ");
        String searchIn = sc.nextLine();
        System.out.print("Enter a single character to search for: ");
        String charStr = sc.nextLine();
        char target = (charStr.isEmpty() ? '\0' : charStr.charAt(0));
        int idx = searchChar(searchIn, target);
        System.out.println("index of '" + target + "': " + idx);

        // 4) Concat names
        System.out.print("Enter first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lName = sc.nextLine();
        String fullName = concatNames(fName, lName);
        System.out.println("Full name: " + fullName);

        System.out.println("=== Done. Now implement the TODOs in the methods! ===");
        sc.close();
    }

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
     * This method has one string parameter and will:
     * 1) change the string to all upper case and
     * 2) return the new string.
     * @param myString
     * @return upper-cased string (null if input is null)
     */
    public static String stringToUpper(String myString) { // the method itself has 'parameters'
        if (myString == null) return null;
        return myString.toUpperCase();
    }

    /**
     * This method has one string parameter and will:
     * 1) change the string to all lower case,
     * 2) return the new string into the 'lowerCaseString' variable
     * @param usersString
     * @return lower-cased string (null if input is null)
     */
    public static String stringToLower(String usersString) {
        if (usersString == null) return null;
        String lowerCaseString = usersString.toLowerCase();
        return lowerCaseString;
    }

    /**
     * This method has one string parameter and will:
     * 1) trim the whitespace from before and after the string, and
     * 2) return the new string.
     * HINT: When getting input from the user (you are the user), try inputting
     * "   a string with whitespace   " to see how the whitespace is trimmed.
     * @param usersStringWithWhiteSpace
     * @return trimmed string (null if input is null)
     */
    public static String stringTrim(String usersStringWithWhiteSpace) {
        if (usersStringWithWhiteSpace == null) return null;
        return usersStringWithWhiteSpace.trim();
    }

    /**
     * This method has three parameters, one string and two integers. It will:
     * 1) get the substring based on the first integer element and the length
     *    of the substring desired.
     * 2) return the substring.
     * @param x
     * @param firstElement
     * @param lengthOfSubstring
     * @return the substring
     * @throws IllegalArgumentException if arguments are invalid
     */
    public static String stringSubstring(String x, int firstElement, int lengthOfSubstring) {
        if (x == null) throw new IllegalArgumentException("input string is null");
        if (firstElement < 0) throw new IllegalArgumentException("start index must be >= 0");
        if (lengthOfSubstring < 0) throw new IllegalArgumentException("length must be >= 0");
        if (firstElement > x.length()) throw new IllegalArgumentException("start index beyond string length");
        if (firstElement + lengthOfSubstring > x.length())
            throw new IllegalArgumentException("start+length exceeds string bounds");
        // substring(beginIndex, endIndexExclusive)
        return x.substring(firstElement, firstElement + lengthOfSubstring);
    }

    /**
     * This method has two parameters, one string and one char. It will:
     * 1) search the string parameter for first occurrence of the char parameter and
     * 2) return the index of the char.
     * HINT: Think about how stringTrim() (above) would be useful in this situation
     * when getting the char from the user.
     * @param userInputString
     * @param charUserWants
     * @return index of the char (or -1 if not found or input is null)
     */
    public static int searchChar(String userInputString, char charUserWants) {
        if (userInputString == null) return -1;
        return userInputString.indexOf(charUserWants);
    }

    /**
     * This method has two string parameters. It will:
     * 1) concatenate the two strings with a space between them.
     * 2) return the new string.
     * HINT: You will need to get the users first and last name in the
     * main method and send them as arguments.
     * @param fName
     * @param lName
     * @return concatenated "first last"
     */
    public static String concatNames(String fName, String lName) {
        // Be forgiving with nulls: treat null as empty, then trim the final result.
        String left = (fName == null) ? "" : fName.trim();
        String right = (lName == null) ? "" : lName.trim();
        String combined = (left + " " + right).trim();
        // If both were null/empty, return empty string to avoid returning null elsewhere in program flow.
        return combined;

    }
}
