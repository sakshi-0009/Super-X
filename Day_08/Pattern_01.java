package Day_08;

import java.io.*;

public class Pattern_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Enter cols : ");
		int cols = Integer.parseInt(br.readLine());
		
		int num = 4;
		char ch = 'D';
        for (int i = 1; i <= rows; i++) {
        	int num1 = num;
        	char ch1 = ch;
            for (int j = 1; j <=cols; j++) {
	        	if(i%2==1) {
	        		System.out.print(ch1--+" ");
	        	}else {
	        		System.out.print(num1--+" ");
	            }
            }
            num++;
            ch++;
            System.out.println();
        }
	}
}
