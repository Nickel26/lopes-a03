/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.util.ArrayList;
import java.util.Scanner;


public class Solution33 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int random;
        ArrayList<String> response = new ArrayList<String>();
        response.add("Yes,");
        response.add("No,");
        response.add("Maybe,");
        response.add("Ask again later.");
        //Prompt user for question
        System.out.print("What's your question?");
        in.next();

        //select pseudo random generated number choice
        random = randomNumberGenerator();

        //display prompt associated with number choice
        System.out.println(response.get(random));
    }

    public static int randomNumberGenerator() {
        // Generate a random number with math.random
        double doubleRandomNumber = Math.random() * 3;
        int randomNumber = (int) doubleRandomNumber;
        return randomNumber;
    }
}


