/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
        import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args){
        Solution24 app = new Solution24();
        //Declare two strings
        String str1;
        String str2;
        System.out.print("Enter two strings and I'll tell you if they are anagrams: ");
        //Prompt user for first string
        str1 = app.getStringFromUser();
        //Prompt user for second string
        str2 = app.getStringFromUser();
        //Determine if two strings are anagrams
        int result = app.isAnagram(str1, str2);

        //Print out result

    }

    private String getStringFromUser() {
        //print input prompt
        //take in string
        //return new string
        return null;
    }

    private int isAnagram(String str1, String str2) {
        //check number of letters and each letter to determine if strings are anagrams
        return 0;
    }


}

