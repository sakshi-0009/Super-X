package Day_05;
import java.io.*;
public class StrongNumber {

	static void isStrongNumber(int n) {
		int sum = 0;
		int temp = n;
		while(n!=0) {
			int rem = n%10;
			int fact = 1;
			
			for(int j=1;j<=rem;j++) {
				fact = fact*j;
			}
			sum = sum+fact;
			n = n/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is a strong number");
		}
		else {
			System.out.println(temp+" is not a strong number");
		}
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int n = Integer.parseInt(br.readLine());
		isStrongNumber(n);	
	}
}
