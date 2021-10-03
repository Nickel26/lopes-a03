/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //initialize inputs
        String firstName, lastName, empID, zCode;

        //prompt user for inputs
        System.out.print("Enter the first name: ");
        firstName = in.next();
        System.out.printf(" first name is %d char long \n", firstName.length());

        System.out.print("Enter the last name: ");
        lastName = in.next();

        System.out.print("Enter the ZIP code: ");
        zCode = in.next();

        System.out.print("Enter the employee ID: ");
        empID = in.next();

        //send inputs to validateInput function
        validateInput(firstName, lastName, zCode, empID);
    }

    public static void validateInput(String firstName, String lastName, String zCode, String empID) {
        //Call functions to validate each input and flag incorrect inputs
        int fNameFlag, lNameFlag, empIDFlag, zCodeFlag;

        fNameFlag = validateFirstName(firstName);

        lNameFlag = validateLastName(lastName);

        zCodeFlag = validateZipCode(zCode);

        empIDFlag = validateEmployeeID(empID);

        if( fNameFlag == 0 && lNameFlag == 0 && zCodeFlag == 0 && empIDFlag == 0){
            System.out.print("There were no errors found.");
        }

        if(fNameFlag == 1){
            System.out.print("The first name must be at least 2 characters long.\n");
            if(firstName.length() == 0){
                System.out.print("The first name must be filled in.\n");
            }
        }

        if(lNameFlag == 1){
            System.out.print("The last name must be at least 2 characters long.\n");
            if(lastName.length() == 0){
                System.out.print("The last name must be filled in.\n");
            }
        }

        if(zCodeFlag == 1){
            System.out.print("The zipcode must be a 5 digit number.\n");
            if(zCode.length() == 0){
                System.out.print("The zipcode must be filled in.\n");
            }
        }

        if(empIDFlag == 1){
            System.out.print("The employee ID must be in the format of AA-1234\n");
            if(empID.length() == 0){
                System.out.print("The employee ID must be filled in.\n");
            }
        }
    }

    public static int validateEmployeeID(String empID) {
        if(empID == null) {
            return 1;
        }

        else if(empID.length() < 7){
            return 1;
        }

        else if(empID.length() == 7){
            char ID[] = empID.toCharArray();
            for(int i = 0; i < 7; i++){
                if( i < 2 && !Character.isLetter(ID[i])){
                    return 1;
                }

                if(i == 2 && ID[i] != '-'){
                    return 1;
                }

                if(i > 2 && !Character.isDigit(ID[i])){
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int validateZipCode(String zCode) {
        if(zCode != null && zCode.length() == 5) {
            if(zCode.chars().allMatch( Character::isDigit )){
                return 0;
            }
        }
        return 1;
    }


    public static int validateLastName(String lName) {
        if(lName == null) {
            return 1;
        }
        else if(lName.length() < 2){
            return 1;
        }
        return 0;
    }

    public static int validateFirstName(String fName) {
        if(fName == null) {
            return 1;
        }
        else if(fName.length() < 2){
            return 1;
        }
        return 0;
    }



}
