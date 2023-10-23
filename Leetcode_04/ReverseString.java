package Leetcode_04;
import java.util.Arrays;
public class ReverseString {
    public void reverseString(char[] s) {
        int b = 0, k = s.length - 1;
        char temp;

        while (b <= k) {
            temp = s[b];
            s[b] = s[k];
            s[k] = temp;
            ++b;
            --k;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        ReverseString solution = new ReverseString();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original String: " + Arrays.toString(input));
        solution.reverseString(input);
        System.out.println("Reversed String: " + Arrays.toString(input));
    }
}
