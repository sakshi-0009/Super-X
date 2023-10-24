package Day_05;

import java.io.*;

public class FactorialNumber {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start : ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter end : ");
		int end = Integer.parseInt(br.readLine());
		
		for(int i=start; i<=end; i++) {
			int fact = 1;
			int k = 1;
			while(k<=i) {
				fact = fact*k;
				k++;
			}
			System.out.println("Factorial of "+i+" is :"+fact);
		}
	}
}
