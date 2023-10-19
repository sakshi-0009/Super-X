package Day_01;
import java.io.*;
public class OddEven {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		double n = Double.parseDouble(br.readLine());
		if(n%2==0) {
			System.out.println(n+" is even number.");
		}else {
			System.out.println(n+" is odd number.");
		}
	}
}
