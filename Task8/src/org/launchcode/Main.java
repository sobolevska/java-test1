package org.launchcode;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
	int numberToGuess= rand.nextInt(1000);
	int numberOfTries=0;
        Scanner input= new Scanner(System.in);
        int guess;
        boolean win= false;

        while (win == false); {

            System.out.println("Guess a number between i and 1000!");
            guess = input.nextInt();
            numberOfTries++;

            if (guess==numberToGuess); {
                win= true; }

            if else (guess<numberToGuess); {
                System.out.println("your guess is too low");
            }

            if else (guess>numberToGuess); {
                System.out.println("your guess is too high");

        }
    }
        System.out.println("You win!");
        System.out.println("The number was" + numberToGuess);
        System.out.println("It took you" + numberOfTries + " tries");



    }
}




