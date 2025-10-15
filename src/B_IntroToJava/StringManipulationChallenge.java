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
        // TODO: Implement this method
        return null;
    }

    /**
     * This method has one string parameter and will:
     * 1) change the string to all lower case,
     * 2) return the new string into the 'lowerCaseString' variable
     * @param usersString
     * @return lower-cased string (null if input is null)
     */
    public static String stringToLower(String usersString) {
        // TODO: Implement this method
        return null;
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
        // TODO: Implement this method
        return null;
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
        // TODO: Implement this method
        // Suggested: validate null input, non-negative indices, and bounds
        return null;
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
        // TODO: Implement this method
        return -1;
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
        // TODO: Implement this method
        return null;
    }

    public static class ControlStatementsSolutions {

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
}
