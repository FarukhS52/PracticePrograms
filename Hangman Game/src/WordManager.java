import java.util.Random;

public class WordManager {
    private String[] words = {"java", "programming", "hangman", "coding", "developer"};

    public String chooseWord() {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }
}

