package Day_01;
import java.io.*;
public class OddEvenInRange {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Start : ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter End : ");
		int end = Integer.parseInt(br.readLine());
		for(int i=start; i<=end; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}
}
