/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.util.Scanner;

public class Solution29 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //initialize variables
        String r;
        int years;
        //loop if input is non numeric or zero until user gives numeric value
        while(true) {
            System.out.print("What is the rate of return? ");
            r = in.next();
            if(r.equals("0") || Character.isLetter(r.charAt(0))){
                System.out.print("Sorry. That's not a valid input.\n");
            }
            else
                break;
        }
        //pass rate of return to howManyYears method
        years = howManyYears(Double.parseDouble(r));
        //display number of years to double initial investment
        System.out.printf("It will take %d years to double your initial investment.", years);

    }

    public static int howManyYears(double r) {
        double year;
        year = 72.0 / r;
        return (int)Math.round(Math.ceil(year));
    }
}
