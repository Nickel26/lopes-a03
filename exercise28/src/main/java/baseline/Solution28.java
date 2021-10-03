/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.util.Scanner;

public class Solution28 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //initialize an int to store sum
        int sum = 0;
        //call addNumber function to prompt user and add sum
        sum = addNumber();
        //display sum
        System.out.printf("The total is %d", sum);
    }

    public static int addNumber(){
        int sum = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            sum += in.nextInt();
        }
        return sum;
    }
}
