package Day_05;

import java.io.*;

public class Occurance {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		
		char ch[] = str.toCharArray();
		char alphabet = 'o';
		int count = 0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == alphabet) {
				count++;
			}
		}
		System.out.println("Occurane of o is : "+count);
	}
}