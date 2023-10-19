package Day_02;

import java.io.*;

public class CompositeNumbers {
	public static void prime(int num) {
		int count = 0;
		for(int i=1; i<=num; i++){
			if(num%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.print(num+" ");
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start : ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter start : ");
		int end = Integer.parseInt(br.readLine());
		for(int i=start; i<=end; i++){
			prime(i);
		}
	}
}
