package com.app.quiz;

import java.util.List;
import java.util.Scanner;

public class Quiz {
    private final List<Question> questions;
    private int score;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            List<String> choices = question.getChoices();

            for (int i = 0; i < choices.size(); i++) {
                System.out.println(i + 1 + ". " + choices.get(i));
            }

            System.out.print("Enter the number of your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == question.getCorrectAnswer()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + question.getChoices().get(question.getCorrectAnswer() - 1) + "\n");
            }
        }

        System.out.println("Quiz completed. Your score: " + score + " out of " + questions.size());
    }
}
