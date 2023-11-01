package Leetcode_07;

import java.io.*;

public class FibonacciSeries {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if(n == 2) {
        	return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());
        int ret = fib(num);
        System.out.println("The "+num+"th Fibonacci number is: "+ret);
    }
}
