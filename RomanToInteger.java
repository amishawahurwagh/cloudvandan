import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanCharToInt(s.charAt(i));

            if (i < s.length() - 1 && currentVal < romanCharToInt(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // Invalid Roman numeral
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + integerEquivalent);

        scanner.close();
    }
}
