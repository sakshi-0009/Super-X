package Day_03;

import java.io.*;

public class Pattern_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Enter cols : ");
		int cols = Integer.parseInt(br.readLine());
		
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i % 2 == 0) {
                    System.out.print((char)('A' + j));
                } else {
                    System.out.print((char)('D' - j));
                }
            }
            System.out.println();
        }
	}
}
