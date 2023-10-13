package Assignment_02;
import java.io.*;
public class PrimeNumbers {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start : ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter end : ");
		int end = Integer.parseInt(br.readLine());
		
		for(int i=start; i<=end; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}
}
