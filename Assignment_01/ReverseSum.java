// Incomplete 

package Assignment_01;
import java.util.Scanner;
public class ReverseSum {

	public static void main(String[] args) {
		
		System.out.println("Enter number : ");
		 Scanner sc = new Scanner(System.in);
		 int i = sc.nextInt();
		 int reverse = 0;
		 while(i != 0) {
			 int rem = i%10;
			 reverse = reverse*10+rem;
			 i = i/10;
		 }
		 System.out.println("Reversed number : "+reverse);
	}
}
