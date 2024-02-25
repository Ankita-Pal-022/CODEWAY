package com.wipro.test;
import java.util.Scanner;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxA = 10;
        int rounds = 0;
        int totalAttempts = 0;
        int Won = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        
        while (true) {
            int numberToGuess = random.nextInt(100);
            int attempts = 0;
            
            System.out.println("\nI have selected a number between 0 and 100 Try to guess it!");
            
            while (attempts < maxA) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + "): ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + numberToGuess + " correctly in " + attempts + " attempts!");
                    Won++;
                    totalAttempts += attempts;
                    break;
                }
            }
            
            rounds++;
            
            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("\nThanks for playing!");
                System.out.println("Total rounds played: " + rounds);
                System.out.println("Total rounds won: " + Won);
                if (Won > 0) {
                    System.out.println("Average attempts per round: " + (double)totalAttempts / Won);
                }
                break;
            }
        }
        
        scanner.close();
    }
}
