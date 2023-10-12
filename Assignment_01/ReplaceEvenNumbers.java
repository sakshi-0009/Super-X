//WAP to replace even numbers with 1 :

package Assignment_01;
import java.io.*;
public class ReplaceEvenNumbers {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of an array: ");
        int size = Integer.parseInt(br.readLine());

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter elements of first array:");
        for (int i=0; i< size; i++){
        	arr1[i] = Integer.parseInt(br.readLine());
            if (arr1[i] % 2 == 0){
            	arr2[i] = 1;
            }
        }
        System.out.println("Array 1:");
        for (int i=0; i< size; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Array 2:");
        for (int i =0; i< size; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
//Time complexity : O(N)
//Space complexity : O(N)