package Day_05;

import java.io.*;

public class Pattern_02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		int num1= 1;
		int num2 = 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=rows; j++) {
            	if(i%2==0) {
            		System.out.print(num2+" ");
            		num2 += 2;
            	}else {
            		System.out.print(num1+" ");
            		num1 += 2;
            	}
            }
            System.out.println();
        }
	}
}
