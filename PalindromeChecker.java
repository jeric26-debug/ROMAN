import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a StringBuilder to reverse the input string
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();

        // Check if the input string is equal to the reversed string
        if (inputString.equals(reversedString.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        scanner.close();
    }
}
