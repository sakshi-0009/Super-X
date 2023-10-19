package Day_01;
import java.io.*;
public class Pattern_02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		int n=1;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((n-i)+" ");
				n++;
			}
			System.out.println();
		}
	}
}
