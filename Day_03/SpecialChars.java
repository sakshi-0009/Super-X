package Day_03;
import java.io.*;
public class SpecialChars {

	public static boolean containsNonLetters(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
        if (containsNonLetters(str)) {
            System.out.println("The string contains special characters.");
        } else {
            System.out.println("The string contains only letters.");
        }
    }
}
