/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.util.Scanner;

public class Solution26 {
    private static final Scanner in = new Scanner(System.in);
    //initialize variables
    public static double n, i, b, p;

    public static void main(String[] args){

        //prompt user for balance on card, apr, and monthly payments
        System.out.print("What is your balance? ");
        b = in.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        i = in.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        p = in.nextDouble();

        //pass information into Payment Calculator
        n = PaymentCalculator.calculateMonthsUntilPaidOff();

        //display number of months till card is paid off
        System.out.printf("It will take you %f months to pay off this card.", n);
    }


}
