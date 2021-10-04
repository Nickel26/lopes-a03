package baseline;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void numGame() {
        int target = 1, numOfGuesses = 0;
        String guess = "1";
        int expectednumOfGuesses = 0;

        System.out.print("I have my number. What's your guess? ");
        boolean b = Character.isLetter(guess.charAt(0)) || Integer.parseInt(guess) != target;
        do {
            if(b){
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
        } while(b);

        //display how many guesses user took
        System.out.printf("You got it in %d guesses!\n\n", numOfGuesses);
        assertEquals(expectednumOfGuesses, numOfGuesses);
    }

}
