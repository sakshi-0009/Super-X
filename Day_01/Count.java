package Day_01;

import java.io.*;

public class Count {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		int count = 0;
		char[] newstr = str.toCharArray();
		for(int i=0; i<newstr.length; i++) {
			count++;
		}
		System.out.println(count);
	}
}
