package Assignment_02;
import java.io.*;
public class Pattern_04 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		for(int i=1; i<=rows; i++) {
			int n = 1;
			for(int j=1; j<=rows; j++) {
				if(j<=rows-i) {
					System.out.print(" ");
				}else {
					System.out.print(i*n+" ");
					n++;
				}
			}
			System.out.println();
		}
	}
}
