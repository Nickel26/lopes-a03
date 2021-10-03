/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.util.Scanner;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String age, restingPulse;

        //take input for age and resting pulse
        while(true) {
            System.out.print("What is the resting pulse? ");
            restingPulse = in.next();

            //check to make sure inputs are numerical values
            if(restingPulse.chars().allMatch( Character::isDigit )) {
                while(true) {
                    System.out.print("What is the age? ");
                    age = in.next();
                    if (age.chars().allMatch(Character::isDigit)) {
                        break;
                    }
                    else
                        System.out.print("Please enter a numeric value. \n");

                }
                break;
            }
            else
                System.out.print("Please enter a numeric value. \n");
        }

        //pass inputs to calculateHeartRate method
        calculateHeartRate(Double.parseDouble(age), Double.parseDouble(restingPulse));
    }

    private static void calculateHeartRate(double age, double restingPulse) {
        double TargetHeartRate = 0;
        //display output format
        System.out.printf("\nResting Pulse: %.0f \t Age: %.0f \n\nIntensity\t | Rate \n-------------|--------\n", restingPulse, age);
        //apply age and resting pulse to formula
        for(double i = 0.55; i <= 0.96; i += 0.05){
            TargetHeartRate = karvonenHeartRate(age, restingPulse, i);
            System.out.printf("%.0f\t\t\t | %.0f\n", (i * 100), TargetHeartRate);
        }
        //display calculated heart rate with each increased intensity
    }

    public static double karvonenHeartRate(double age, double restingPulse, double i) {
        double heartRate = Math.round((((220.0 - age) - restingPulse) * i) +restingPulse);
        return heartRate;
    }
}
