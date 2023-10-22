package Day_04;
import java.io.*;
class UpperOrLowercase {
	
	static void string(String s) {
		char ch[] = s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				System.out.print((char)(ch[i]+32));
			}else if(ch[i]>=97 && ch[i]<=122) {
				System.out.print((char)(ch[i]-32));
			}
		}
		System.out.println();
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
		string(str);
	}
}
