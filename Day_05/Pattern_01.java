package Day_05;

import java.io.*;

public class Pattern_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		
    	char ch = 'a';
        for (int i = 1; i <= rows; i++) {
        	if(i%2!=0) {
        		ch = 'a';
        	}else {
        		ch = 'A';
        	}
            for (int j = 1; j <=i; j++) {
            	System.out.print(ch+" ");
            	ch++;
            }
            System.out.println();
        }
	}
}
