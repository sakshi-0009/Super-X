package Day_08;

import java.io.*;

public class RepeatingChar {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");//pneumonoultramicroscopicsillicovolcanoconiosis
        String str = br.readLine();
        
        char ch[] = str.toCharArray();
        char ch1[] = new char[ch.length];
        int num = 0;
        for(int i=0; i<ch.length; i++) {
        	int count = 0;
        	int flag = 0;
        	for(int j=0; j<ch.length; j++) {
        		if(ch[i]==ch[j]) {
        			for(int k=0; k<ch1.length; k++) {
        				if(ch[i]==ch1[k]) {
        					flag = 1;
        				}
        			}
        			if(flag==1) {
        				break;
        			}else {
        				count++;
        			}
        		}
        	}
        	if(count>0) {
        		System.out.println(ch[i]+"="+count);
        		ch[num++] = ch[i];
        	}
        }
	}
}
