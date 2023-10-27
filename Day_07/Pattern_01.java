package Day_07;

import java.io.*;

public class Pattern_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Enter cols : ");
		int cols = Integer.parseInt(br.readLine());
		
		int num = 1;
		char ch = 'a';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=cols; j++) {
	        	if(i%2==1) {
	        		System.out.print(num+" ");
	        		num++;
	        	}else {
	        		System.out.print(ch+" ");
	        		ch++;
	            }
            }
            System.out.println();
        }
	}
}
