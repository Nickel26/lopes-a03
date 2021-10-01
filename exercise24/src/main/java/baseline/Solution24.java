/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
        import java.util.Scanner;
        import java.util.Arrays;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Solution24 app = new Solution24();
        //Declare two strings
        String str1;
        String str2;
        System.out.print("Enter two strings and I'll tell you if they are anagrams: \n");
        //Prompt user for first string
        str1 = app.getStringFromUser();
        //Prompt user for second string
        str2 = app.getStringFromUser();
        //Determine if two strings are anagrams and print result
        if(app.isAnagram(str1, str2)){
            System.out.print(str1 + " and "+ str2 +" are anagrams.");
        }
        else
            System.out.print(str1 + " and "+ str2 +" are not anagrams.");
    }

    private String getStringFromUser() {
        //print input prompt
        System.out.print("Enter a string: ");

        //take in string and return
        return in.next();
    }

    public boolean isAnagram(String str1, String str2) {
        //check string length and each letter to determine if strings are anagrams
        int n1 = str1.length();
        int n2 = str2.length();


        if(n1 != n2){
            return false;
        }
        else{
            char[] s1 = str1.toCharArray();
            Arrays.sort(s1);

            char[] s2 = str2.toCharArray();
            Arrays.sort(s2);
            if(Arrays.equals(s1, s2))
                return true;
            else
                return false;
        }

    }


}

