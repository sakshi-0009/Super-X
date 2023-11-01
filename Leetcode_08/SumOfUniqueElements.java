package Leetcode_08;
import java.io.*;
public class SumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int flag = 0;
            
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if (nums[i] == nums[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                sum += nums[i];
            }
        }
        return sum;
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
        int uniqueSum = sumOfUnique(arr);
        System.out.println("The sum of unique elements in the array is: " + uniqueSum);
    }
}
