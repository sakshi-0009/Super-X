//Armstrong number :

package Assignment_01;
import java.io.*;
public class ArmstrongNumber {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int n = Integer.parseInt(br.readLine());
        int temp1 = n;
        int count = 0;
        int sum = 0;
        while (temp1 != 0) {
            count++;
            temp1 = temp1 / 10;
        }
        temp1 = n;
        while (temp1 != 0) {
            int rem = temp1 % 10;
            int mult = 1;

            for (int i = 1; i <= count; i++) {
                mult = mult*rem;
            }
            sum = sum + mult;
            temp1 = temp1 / 10;
        }
        if (sum == n) {
            System.out.println("Armstrong Number!");
        } else {
            System.out.println("Not an Armstrong Number!");
        }
	}
}
//Time complexity : O(N^2)
//Space complexity : O(1)