package Day_06;

import java.io.*;

public class ReplaceVowels {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				 System.out.print("#");
			}else {
				System.out.print(ch[i]);
			}
		}
	}
}