package Leetcode_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapitalizeTitle {
    public static String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            if (words[i].length() > 2) {
                String first = words[i].substring(0, 1);
                String last = words[i].substring(1);
                first = first.toUpperCase();
                words[i] = first + last;
            }
        }
        String ans = "";
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                ans += words[i];
            } else {
                ans += words[i] + " ";
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
        String str = br.readLine();
        String capitalizedTitle = capitalizeTitle(str);
        System.out.println("Capitalized Title: " + capitalizedTitle);
    }
}
