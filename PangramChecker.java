import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String input) {
        int[] alphabet = new int[26]; // An array to represent the English alphabet (26 letters)
        input = input.toLowerCase(); // Convert the input to lowercase for case-insensitive check

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // If the character is a lowercase letter, mark it as present in the alphabet
                alphabet[c - 'a'] = 1;
            }
        }

        // Check if all letters in the alphabet are marked as present (have a value of 1)
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == 0) {
                return false; // Not all letters are present
            }
        }

        return true; // All letters are present, it's a pangram
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a pangram: ");
        String input = scanner.nextLine();

        boolean result = isPangram(input);
        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }
}
