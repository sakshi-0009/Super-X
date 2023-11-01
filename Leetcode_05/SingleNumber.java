package Leetcode_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
        int result = 0;
        
        for (int num : nums) {
            result ^= num;
        }
        return result;
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
        int result1 = singleNumber(arr);
        System.out.println("Single Number: " + result1);
    }
}

