package Day_06;

import java.io.*;

public class Pattern_02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		int num = 1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
	        	if(num==1) {
	        		System.out.print(num);
	        	}else {
	        		System.out.print(num*num*num - 1+" ");
	            }
	        	num++;
            }
            System.out.println();
        }
	}
}
