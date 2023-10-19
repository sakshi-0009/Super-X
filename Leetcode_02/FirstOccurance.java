package Leetcode_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstOccurance {
    public static int strStr(String haystack, String needle) {
        if (needle == null || haystack == null) {
            return -1;
        }
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter haystack : ");
		String haystack = br.readLine();
		System.out.println("Enter needle : ");
		String needle = br.readLine();
        int result1 = strStr(haystack, needle);
        System.out.println(result1);
    }
}
