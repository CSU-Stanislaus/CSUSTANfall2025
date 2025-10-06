package C_ControlStatements;

import java.util.*;

public class ForLoops {
    public static void main(String[] args) {
        String text = "Hello World!";
        int count = 0;

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {
            count++;
        }

        System.out.println("Number of characters: " + count);

        // --- Optional quick tests (uncomment to try) ---
        // System.out.println(reverseString("hello"));           // expect: "olleh"
        // System.out.println(isPalindrome("Racecar"));         // expect: true
        // System.out.println(countVowels("Hello World"));      // expect: 3
        // System.out.println(countConsonants("Hello"));        // expect: 3
        // System.out.println(wordCount("One  two   three"));   // expect: 3
        // System.out.println(removeVowels("Beautiful day"));   // expect: "Btfl dy"
        // System.out.println(charFrequency("abca"));           // expect: {a=2, b=1, c=1}
        // System.out.println(mostFrequentChar("mississippi")); // expect: 'i' (first max)
        // System.out.println(countSubstr("aaaa", "aa"));      // expect: 2
        // System.out.println(isAnagram("Listen", "Silent"));  // expect: true
    }

    /**
     * EXERCISE 1 – Reverse String
     * Goal: Return the reverse of the input.
     * Example: "hello" -> "olleh"
     */
    public static String reverseString(String s) {
        // TODO: implement using a for loop from end to start
        return null;
    }

    /**
     * EXERCISE 2 – Palindrome Check (case-insensitive)
     * Goal: Return true if s reads the same forwards and backwards.
     * Examples: "Racecar" -> true, "hello" -> false
     */
    public static boolean isPalindrome(String s) {
        // TODO: normalize (lowercase), compare chars from both ends with a for loop
        return false;
    }

    /**
     * EXERCISE 3 – Count Vowels
     * Goal: Count how many vowels (a, e, i, o, u) are in s.
     * Example: "Hello World" -> 3
     */
    public static int countVowels(String s) {
        // TODO: loop over s and increment when char is a vowel (ignore case)
        return 0;
    }

    /**
     * EXERCISE 4 – Count Consonants
     * Goal: Count alphabetic characters that are NOT vowels.
     * Example: "Hello" -> 3
     */
    public static int countConsonants(String s) {
        // TODO: loop; check Character.isLetter(c) and not a vowel
        return 0;
    }

    /**
     * EXERCISE 5 – Word Count
     * Goal: Return number of words separated by whitespace.
     * Example: "One  two   three" -> 3
     */
    public static int wordCount(String s) {
        // TODO: trim, then count transitions or split on regex "\\s+" without using Streams
        return 0;
    }

    /**
     * EXERCISE 6 – Anagram Check (ignore case & spaces)
     * Goal: Return true if a and b contain the same letters with the same counts.
     * Examples: "Listen" vs "Silent" -> true; "apple" vs "papel" -> true
     */
    public static boolean isAnagram(String a, String b) {
        // TODO: normalize (lowercase, remove spaces), count chars using int[26] or a Map
        return false;
    }

    /**
     * EXERCISE 7 – Remove Vowels
     * Goal: Return s with all vowels removed.
     * Example: "Beautiful day" -> "Btfl dy"
     */
    public static String removeVowels(String s) {
        // TODO: build a new String without a/e/i/o/u (case-insensitive)
        return null;
    }

    /**
     * EXERCISE 8 – Character Frequency Map
     * Goal: Return a frequency map of all characters in s.
     * Example: "abca" -> {a=2, b=1, c=1}
     */
    public static Map<Character, Integer> charFrequency(String s) {
        // TODO: loop and update counts in a HashMap
        return null;
    }

    /**
     * EXERCISE 9 – Most Frequent Character (first max on ties)
     * Goal: Return the character that appears the most in s.
     * Example: "mississippi" -> 'i'
     */
    public static char mostFrequentChar(String s) {
        // TODO: reuse charFrequency; track max count and earliest index for tie-break
        return '\0';
    }

    /**
     * EXERCISE 10 – Count Substring Occurrences (non-overlapping)
     * Goal: Count how many times sub appears in s (non-overlapping).
     * Example: s="aaaa", sub="aa" -> 2
     */
    public static int countSubstr(String s, String sub) {
        // TODO: use a loop moving index by sub.length() when a match is found
        return 0;
    }

    // Helper: vowel check
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}

