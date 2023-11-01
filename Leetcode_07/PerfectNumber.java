package Leetcode_07;

import java.io.*;

public class PerfectNumber {
    public static boolean checkPerfectNum(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());
        boolean isPerfect = checkPerfectNum(num);
        
        if (isPerfect) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
