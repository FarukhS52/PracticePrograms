class GameManager {
    private String wordToGuess;
    private StringBuilder guessedWord;
    private int attemptsLeft;

    public GameManager(String wordToGuess) {
        this.wordToGuess = wordToGuess;
        this.guessedWord = new StringBuilder("_".repeat(wordToGuess.length()));
        this.attemptsLeft = 6; // You can customize the number of attempts
    }

    public String displayWord() {
        return guessedWord.toString();
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public void makeGuess(char guess) {
        if (wordToGuess.contains(String.valueOf(guess))) {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord.setCharAt(i, guess);
                }
            }
        } else {
            attemptsLeft--;
        }
    }

    public boolean isGameOver() {
        return attemptsLeft == 0 || guessedWord.indexOf("_") == -1;
    }

    public boolean isGameWon() {
        return guessedWord.indexOf("_") == -1 && guessedWord.toString().equals(wordToGuess);
    }


    public String getWordToGuess() {
        return wordToGuess;
    }
}