package com.app.quiz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();


        questions.add(new Question("What is the capital of France?", List.of("London", "Berlin", "Paris", "Madrid"), 3));
        questions.add(new Question("Which planet is known as the Red Planet?", List.of("Earth", "Mars", "Venus", "Jupiter"), 2));
        questions.add(new Question("What is the largest mammal in the world?", List.of("Elephant", "Blue Whale", "Giraffe", "Lion"), 2));
        questions.add(new Question("What is the largest planet in our solar system?", List.of("Earth", "Jupiter", "Mars", "Venus"), 2));
        questions.add(new Question("Which gas do plants absorb from the atmosphere during photosynthesis?", List.of("Oxygen", "Carbon dioxide", "Nitrogen", "Hydrogen"), 2));
        questions.add(new Question("Who is known as the father of modern physics?", List.of("Isaac Newton", "Galileo Galilei", "Albert Einstein", "Stephen Hawking"), 3));
        questions.add(new Question("In which year did Christopher Columbus discover America?", List.of("1492", "1776", "1812", "1607"), 1));
        questions.add(new Question("What is the chemical symbol for water?", List.of("H2O", "CO2", "O2", "NaCl"), 1));
        questions.add(new Question("Who wrote the play 'Romeo and Juliet'?", List.of("Charles Dickens", "William Shakespeare", "Jane Austen", "George Orwell"), 2));
        questions.add(new Question("What is the largest organ in the human body?", List.of("Heart", "Liver", "Skin", "Lungs"), 3));
        questions.add(new Question("What is the chemical symbol for gold?", List.of("Go", "Ag", "Au", "Ge"), 3));
        questions.add(new Question("How many continents are there on Earth?", List.of("5", "6", "7", "8"), 2));
        questions.add(new Question("What is the freezing point of water in degrees Celsius?", List.of("0°C", "32°C", "-273°C", "100°C"), 1));
        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}

