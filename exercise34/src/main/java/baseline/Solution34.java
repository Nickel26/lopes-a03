/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String remove;
        //create array list with employee names
        ArrayList<String> employeeList = new ArrayList<String>();
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");
        employeeList.add("Tom Brady");
        //Display full array list
        System.out.printf("There are %d employees:\n", employeeList.size());
        for(int i = 0; i < employeeList.size(); i++){
            System.out.println(employeeList.get(i));
        }
        //ask user for which employee to remove
        System.out.print("Enter an employee name to remove: ");
        remove = in.nextLine();
        //move all other employees into new arraylist
        ArrayList<String> newEmployeeList = new ArrayList<String>();
        for(int i = 0; i < employeeList.size() - 1; i++){
            if(remove.equals(employeeList.get(i))){
                break;
            }
            newEmployeeList.add(employeeList.get(i));
        }
        //display new arraylist
        System.out.printf("There are %d employees:\n", newEmployeeList.size());
        for(int i = 0; i < newEmployeeList.size(); i++){
            System.out.println(employeeList.get(i));
        }
    }
}
