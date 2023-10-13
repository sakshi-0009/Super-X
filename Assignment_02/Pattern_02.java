package Assignment_02;
import java.io.*;
public class Pattern_02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		int n = 1;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(n*n-1 +" ");
				n++;
			}
			System.out.println();
		}
	}
}
