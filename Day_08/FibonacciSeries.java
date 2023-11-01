package Day_08;
import java.io.*;
class FibonacciSeries {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());
		
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i =1 ; i <= num; i++){
            System.out.print(sum+" ");
            a = b;
            b = sum;
            sum = a + b;
        }            
    }
}