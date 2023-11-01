package Day_08;
import java.io.*;
public class Pattern_02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		int num = 4;
		char ch = 'D';
        for (int i = 1; i <= rows; i++) {
        	int num1 = num;
        	char ch1 = ch;
            for (int j = 1; j <=rows-i+1; j++) {
	        	if(i%2==1) {
	        		System.out.print(num1--+" ");
	        	}else {
	        		System.out.print(ch1--+" ");
	            }
            }
            num--;
            ch--;
            System.out.println();
        }
	}
}
