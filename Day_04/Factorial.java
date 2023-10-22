package Day_04;
import java.io.*;
public class Factorial {

	static void factorial(int num) {
		int prod = 1;
		for(int i=1; i<=num; i++) {
			prod = prod*i;
		}
		System.out.println("Factorial of "+num+" is "+prod);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());
		factorial(num);
	}
}
