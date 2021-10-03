/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args){
        //create a loop that iterates 12 times
        for(int i = 1; i <= 12; i++){
            for(int j = 1; j <= 12; j++){
                System.out.format("%4d ", (i * j));
            }
            System.out.print("\n");
        }
        //create a nested loop that also iterates 12 times
        //inside nested loop multiply the first loop by the iteration of the nested and display that number
    }
}
