package Hangman;

import java.util.Scanner;

public class Hangman {
    private boolean running = true;
    private RandomWord word = new RandomWord();
    Scanner scanner = new Scanner(System.in);
    private int triesRemaining = 5;
    private char lastGuess;
    public void run() {

        do {
            displayWord();
            getUserInput();
            checkUserInput();
        } while (running);
    }

    void displayWord() {
        System.out.println(word);;
    }

    void getUserInput() {
        System.out.println("Tries remaining: " + triesRemaining);
        System.out.print("Enter your guess: ");
        String guess = scanner.nextLine(); // apparently scanner doesn't have nextChar method
        lastGuess = guess.charAt(0);
    }

    void checkUserInput() {
        boolean isCorrect = word.addGuess(lastGuess);

        if(isCorrect) {
            if(word.isComplete()) {
                System.out.println("You have won!");
                running = false;
            }
        } else {
            triesRemaining--;
            if (triesRemaining == 0) {
                System.out.println("You have lost!");
                running = false;
            }
        }
    }

    public void close() {
        scanner.close();
    }
}
