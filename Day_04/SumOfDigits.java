package Day_04;
import java.io.*;
public class SumOfDigits {

	static void Sum(int start, int end) {
		int sum = 0;
		for(int i=start; i<=end; i++) {
			sum = sum+i;
		}
		System.out.println("Sum of all numbers in given range is: "+sum);

	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start : ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter end : ");
		int end = Integer.parseInt(br.readLine());
		Sum(start,end);
	}
}
