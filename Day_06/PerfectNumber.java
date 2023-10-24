package Day_06;

import java.io.*;

public class PerfectNumber {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		if(sum == n) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not perfect number");
		}
	}
}
