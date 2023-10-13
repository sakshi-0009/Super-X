package Assignment_02;
import java.io.*;
public class Pattern_03 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());

		int n = rows;
		for(int i=1; i<=rows; i++) {
			int k = 0;
			for(int j=1; j<=i; j++) {
				System.out.print(n+" ");
				n=n+i;
				k=k+i;
			}
			if(i>1) {
				n = n-(--k);
			}
			System.out.println();
		}
	}
}
