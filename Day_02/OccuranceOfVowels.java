//WAP to find occurance of vowels in given string:

package Day_02;
import java.io.*;
public class OccuranceOfVowels {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		String str = br.readLine();
        str = str.toLowerCase();
        int aCount = 0,eCount = 0,iCount = 0,oCount = 0,uCount = 0;
    
        for (int i=0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='a'){
                aCount++;
            } else if (ch=='e'){
                eCount++;
            } else if (ch=='i'){
                iCount++;
            } else if (ch=='o'){
                oCount++;
            } else if (ch=='u'){
                uCount++;
            }
        }
        System.out.println("a="+aCount);
        System.out.println("e="+eCount);
        System.out.println("i="+iCount);
        System.out.println("o="+oCount);
        System.out.println("u="+uCount);
	}
}
//Time complexity : O(N)
//Space complexity : O(1)