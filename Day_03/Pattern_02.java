package Day_03;

import java.io.*;

public class Pattern_02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= rows; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}
}
