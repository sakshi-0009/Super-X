//WAP to check whether string is palindrome or not:

package Assignment_01;
import java.io.*;
public class PalindromeString {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		
//		********** In-built function **********
//		String reversedStr = new StringBuilder(str).reverse().toString();
//
//        if (str.equals(reversedStr)) {
//            System.out.println("Palindrome.");
//        } else {
//            System.out.println("Not Palindrome.");
//        }
        
		boolean isPalindrome = true;
        for (int i=0; i< str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not Palindrome.");
        }
	}
}
//Time complexity : O(N)
//Space complexity : O(1)
