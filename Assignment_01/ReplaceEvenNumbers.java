package Assignment_01;

import java.io.*;

public class ReplaceEvenNumbers {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(br.readLine());

        int[] firstArray = new int[size];
        int[] secondArray = new int[size];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size; i++) {
            firstArray[i] = Integer.parseInt(br.readLine());
            if (firstArray[i] % 2 == 0) {
                secondArray[i] = 1;
            }
        }
        System.out.println("First Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();

        System.out.println("Second Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
