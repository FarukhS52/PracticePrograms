import java.util.Random;
import java.util.Scanner;

public class HangmanApp {
    public static void main(String[] args) {
        WordManager wordManager = new WordManager();
        GameManager gameManager = new GameManager(wordManager.chooseWord());

        while (!gameManager.isGameOver()) {
            System.out.println("Word: " + gameManager.displayWord());
            System.out.println("Attempts left: " + gameManager.getAttemptsLeft());

            char guess = InputManager.getGuessFromUser();
            gameManager.makeGuess(guess);
        }

        if (gameManager.isGameWon()) {
            System.out.println("Congratulations! You guessed the word.");
        } else {
            System.out.println("Sorry, you ran out of attempts. The word was: " + gameManager.getWordToGuess());
        }
    }
}