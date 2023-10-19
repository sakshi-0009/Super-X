package Day_02;

import java.io.*;

public class PrimeComposite {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=1; i<=num; i++){
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num+" is prime number.");
		}else {
			System.out.println(num+" is composite number.");
		}
	}
}
