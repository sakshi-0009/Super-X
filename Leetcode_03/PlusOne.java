package Leetcode_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusOne {

	public static int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] == 9) {
            return new int[]{1, 0};
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr1[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}
        int[] arr2 = plusOne(arr1);
        System.out.print("Result for arr1: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
