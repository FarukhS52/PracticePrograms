import java.security.SecureRandom;
import java.util.Scanner;

public class RandomPasswordGenerator{
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:'<>,.?/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        System.out.print("Include Uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include Numbers? (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include Special Characters? (yes/no): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");

        RandomPasswordGenerator RandomPasswordGenerator = new RandomPasswordGenerator();
        String password = RandomPasswordGenerator.generatePassword(length, includeUppercase, includeNumbers, includeSpecialChars);

        System.out.println("Generated Password: " + password);
    }

    private String generatePassword(int length, boolean includeUppercase, boolean includeNumbers, boolean includeSpecialChars) {
        StringBuilder validChars = new StringBuilder(LOWERCASE_CHARS);

        if (includeUppercase) {
            validChars.append(UPPERCASE_CHARS);
        }

        if (includeNumbers) {
            validChars.append(NUMBERS);
        }

        if (includeSpecialChars) {
            validChars.append(SPECIAL_CHARS);
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }
}
