package Day_07;

import java.io.*;

public class DuckNumber {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int count = 0;
		while(num!=0) {
			if(num%10==0) {
				count++;
			}
			num = num/10;
		}
		if(count!=0) {
			System.out.println(temp+" is a Duck number!");
		}else {
			System.out.println(temp+" is a not a Duck number!");
		}
	}
}
