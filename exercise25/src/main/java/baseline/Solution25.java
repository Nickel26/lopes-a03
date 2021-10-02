/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //initialize two strings
        int strength;
        String pass;
        String passStrength = "weak";

        //prompt user for password
        System.out.print("Enter a strong password: ");
        pass = in.next();

        //give password to checkStrength
        strength = passwordValidator(pass);
        switch (strength){
            case 0 : passStrength = "very weak";
                break;
            case 1 : passStrength = "weak";
                break;
            case 2 : passStrength = "strong";
                break;
            case 3 : passStrength = "very strong";
                break;
        }

        //Print password strength
        System.out.print("The password " + pass + " is a " + passStrength +" password.");
    }

    public static int passwordValidator(String pass) {
        //check password features with standard values
        char[] passArray = pass.toCharArray();
        int length = pass.length();
        int special = 0;
        int num = 0;
        int letter = 0;

        if(length < 8){
            for(int i = 0; i < length; i++) {
                if ((passArray[i] >= 'A' && passArray[i] <= 'Z') || (passArray[i] >= 'a' && passArray[i] <= 'z')) {
                    return 1;
                }
                else if (passArray[i] >= '0' && passArray[i] <= '9') {
                    return 0;
                }
                else
                    return -1;
            }
        }

        else if(length >= 8){
            for(int i = 0; i < length; i++) {
                if ((passArray[i] >= 'A' && passArray[i] <= 'Z') || (passArray[i] >= 'a' && passArray[i] <= 'z')) {
                    letter += 1;
                }
                else if (passArray[i] >= '0' && passArray[i] <= '9') {
                    num += 1;
                }
                else if ((passArray[i] >= '!' && passArray[i] <= '/') || (passArray[i] >= ':' && passArray[i] <= '@')|| (passArray[i] >= '[' && passArray[i] <= 96) || (passArray[i] >= '{' && passArray[i] <= '~')){
                    special += 1;
                }
            }
            if((num > 0) && (letter > 0)){
                return 2;
            }
            else if((num > 0) && (letter > 0) && (special > 0)){
                return 3;
            }

        }

        return -1;
    }
}
