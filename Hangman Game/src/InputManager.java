import java.util.Scanner;

public class InputManager {
    private static Scanner scanner = new Scanner(System.in);

    public static char getGuessFromUser() {
        System.out.print("Enter your guess: ");
        String input = scanner.next().toLowerCase(); // Convert the input to lowercase
        if (input.length() == 1) {
            return input.charAt(0);
        } else {
            System.out.println("Please enter a single letter.");
            return getGuessFromUser(); // Recursively call to get a valid guess
        }
    }
}
