/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Character difficulty, replay = 'y';
        System.out.print("Let's play Guess the Number!\n");
        //prompt user for desired difficulty level
        while(true) {
            while (true) {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                difficulty = in.next().charAt(0);
                if (difficulty != '1' && difficulty != '2' && difficulty != '3') {
                    System.out.print(difficulty + " is not 1, 2, or 3 \t Please try again\n");
                } else
                    break;
            }
            //depending on user choice send choice into numGame method
            numGame(difficulty);
            System.out.print("Do you wish to play again (Y/N)?");
            replay = in.next().charAt(0);

            if (replay == 'n' || replay == 'N')
                break;
        }
    }

    public static void numGame(char difficulty) {
        Random rand = new Random();
        int target, numOfGuesses = 0;
        String guess;

        //picks random number between 1 and whichever difficulty user chose
        if(difficulty == '1') {
            target = rand.nextInt(11);
        }
        else if(difficulty == '2') {
            target = rand.nextInt(101);
        }
        else {
            target = rand.nextInt(1001);
        }
        //prompt user to guess number
        System.out.print("I have my number. What's your guess? ");
       do {
            guess = in.next();
           //display if user is higher or lower than number
            if(( Character.isLetter(guess.charAt(0)) || Integer.parseInt(guess) != target)){
                if(Character.isLetter(guess.charAt(0))){
                    System.out.print("Not a number. Guess again: ");
                    numOfGuesses++;
                }
                else if(Integer.parseInt(guess) < target){
                    System.out.print("Too low. Guess again: ");
                    numOfGuesses++;
                }
                else if(Integer.parseInt(guess) > target){
                    System.out.print("Too high. Guess again: ");
                    numOfGuesses++;
                }
            }
            else{
                break;
            }
        } while(Character.isLetter(guess.charAt(0)) || Integer.parseInt(guess) != target);

        //display how many guesses user took
        System.out.printf("You got it in %d guesses!\n\n", numOfGuesses);
    }
}
