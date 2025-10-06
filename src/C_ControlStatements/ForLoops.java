package C_ControlStatements;

public class ForLoops {
    public static void main(String[] args) {
        String text = "Hello World!";
        int count = 0;

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {
            count++;
        }

        System.out.println("Number of characters: " + count);
    }
}
