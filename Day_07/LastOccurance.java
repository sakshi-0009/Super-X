package Day_07;

import java.io.*;

public class LastOccurance {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		char ch[] = str.toCharArray();
		char target = 'o';
		int index = 0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]==target) {
				index = i;
			}
		}
		System.out.println("Last Occurance of targer :"+index);
	}
}
