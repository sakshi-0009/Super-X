package Day_07;

import java.io.*;

public class Pattern_02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		int num = 10;
		
		for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=i; j++) {
            	System.out.print(num+" ");
            	num--;
            }
            System.out.println();
        }
	}
}
