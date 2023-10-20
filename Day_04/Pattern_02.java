package Day_04;

import java.io.*;

public class Pattern_02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());

        for (int i = 0; i < rows; i++) {
        	for (int j = i; j>=0; j--) {
                System.out.print((char)(j+65)+ " ");
            }
            System.out.println();
        }
	}
}
