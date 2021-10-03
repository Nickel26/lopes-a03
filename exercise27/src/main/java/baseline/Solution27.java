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
        String FirstName, LastName, EmpID, ZCode;
        //prompt user for inputs
        //send inputs to validateInput function

    }

    private static void validateInput(){
        //Call functions to validate each input and flag incorrect inputs
        int FnameFlag, LnameFlag, EmpIDFlag, ZCodeFlag;

        validateFirstName();
        validateLastName();
        validateEmployeeID();
        validateZipCode();
    }

    private static void validateFirstName() {
        //validates if first name is at least 2 char long
    }

    private static void validateLastName() {
        //validates if last name is at least 2 char long
    }

    private static void validateEmployeeID() {
        //validates if employee ID is in correct format of AA-1234
    }

    private static void validateZipCode() {
        //validates if zipcode is a 5 digit number
    }
}
