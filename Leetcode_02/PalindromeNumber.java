package Leetcode_02;
import java.io.*;
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;

        if (x < 0) 
            return false;
        while (temp != 0) {  
            int remainder = temp % 10;  
            reverse = reverse * 10 + remainder;  
            temp = temp / 10;  
        }  
        return reverse == x;
    }

    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());
        boolean isPalindromic = isPalindrome(num);

        if (isPalindromic) {
            System.out.println(num + " is palindrome number.");
        } else {
            System.out.println(num + " is not palindrome number.");
        }
    }
}
