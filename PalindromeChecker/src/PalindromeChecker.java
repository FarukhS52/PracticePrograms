import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        String reverseInput="";

        for(int i=0;i<input.length();i++){
            reverseInput = input.charAt(i) + reverseInput;
        }
        if(input.equals(reverseInput)){
            System.out.println(input + " is a Palindrome");
        }
        else
            System.out.println(input + " is not a Palindrome");
    }

}
