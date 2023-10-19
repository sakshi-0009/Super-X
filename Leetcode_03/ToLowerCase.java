package Leetcode_03;

import java.io.*;

public class ToLowerCase {
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) throws IOException{
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string: ");
        String input = reader.readLine();

        String lowercaseString = toLowerCase(input);

        System.out.println("Lowercase: " + lowercaseString);
    }
}
