package Assignment_01;

import java.util.Arrays;

public class ReverseSum {
    private static final String OUTPUT_FORMAT = "Output: [%s]";

    public static void main(String[] args) {
        int input = 45689;
        int[] array = reverseNumberSumArray(input);

        System.out.printf(OUTPUT_FORMAT, Arrays.toString(array));
    }

    private static int[] reverseNumberSumArray(int input) {
        int[] array = new int[0];

        // Reverse the number.
        int reversedNumber = 0;
        while (input > 0) {
            reversedNumber = reversedNumber * 10 + input % 10;
            input /= 10;
        }

        // Calculate the successive number sum and add it to the array.
        int successiveNumberSum = 0;
        while (reversedNumber > 0) {
            successiveNumberSum += reversedNumber % 10;
            array = addElementToArray(array, successiveNumberSum);
            reversedNumber /= 10;
        }

        return array;
    }

    private static int[] addElementToArray(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[newArray.length - 1] = element;
        return newArray;
    }
}
