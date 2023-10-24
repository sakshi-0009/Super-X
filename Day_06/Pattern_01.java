package Day_06;

import java.io.*;

public class Pattern_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Enter cols : ");
		int cols = Integer.parseInt(br.readLine());
		
		int num = 1;
        for (int i = 1; i <= rows; i++) {
        	char ch = 'A';
            for (int j = 1; j <=cols; j++) {
	        	if(i%2==1) {
	        		System.out.print(ch+" ");
	        		ch++;
	        	}else {
	        		System.out.print(num+" ");
	        		num += 2;
	            }
            }
            System.out.println();
        }
	}
}
