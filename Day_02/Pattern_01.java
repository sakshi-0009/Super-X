package Day_02;

import java.io.*;

public class Pattern_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		char ch = 'A';
		char ch1 = ch;
		for (int i = 1; i <= rows; i++) {
			ch = ch1;
            for (int j = 1; j <= rows; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch1++;
            System.out.println();
        }
	}
}
