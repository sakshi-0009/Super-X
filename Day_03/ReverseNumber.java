package Day_03;
import java.io.*;
public class ReverseNumber {

	public static void reverse(int N) {
		int reverse = 0;
        while(N!=0){
            int rem = N % 10;
            reverse = reverse * 10 + rem;
            N = N/10;
        }
        System.out.println(reverse);
	}
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Start : ");
        int start = Integer.parseInt(br.readLine());
        System.out.println("Enter End : ");
        int end = Integer.parseInt(br.readLine());
        
        for(int i=start; i<=end; i++) {
        	System.out.println(i);;
        }
        System.out.println("Reverse of above numbers :");
        for(int i=start; i<=end; i++) {
        	reverse(i);
        }
        
    }
}
