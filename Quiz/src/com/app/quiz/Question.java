package com.app.quiz;

import java.util.List;

public class Question {
    private final String question;
    private final List<String> choices;
    private final int correctAnswer;

    public Question(String question, List<String> choices, int correctAnswer) {
        this.question = question;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
