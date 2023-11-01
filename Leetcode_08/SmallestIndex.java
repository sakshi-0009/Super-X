package Leetcode_08;

import java.io.*;

public class SmallestIndex {
    public static int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
        int index = smallestEqual(arr);

        if (index != -1) {
            System.out.println("The smallest equal element is at index " + index);
        } else {
            System.out.println("No element is equal to its index.");
        }
    }
}
