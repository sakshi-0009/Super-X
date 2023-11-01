package Leetcode_05;

import java.io.*;

public class MissingNumber {

	public static int missingNumber(int[] nums) {
		int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int Sum = 0;

        for (int num : nums) {
            Sum = Sum + num;
        }

        return expectedSum - Sum;
    }
    public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
        int result1 = missingNumber(arr);
        System.out.println("Missing Number: " + result1);
    }
}
