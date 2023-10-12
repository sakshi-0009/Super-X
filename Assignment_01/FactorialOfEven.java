//WAP to find the factorial of even number :

package Assignment_01;

public class FactorialOfEven {
	public static void main(String[] args) {
        int n = 256946;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                int factorial = Factorial(digit);
                System.out.print(factorial+",");
            }
            temp /= 10;
        }
    }
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
//Time complexity : O(N)
//Space complexity : O(1)
