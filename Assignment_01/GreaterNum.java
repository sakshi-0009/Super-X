//WAP to find number which has number on it's left is less than or equal to itself.

package Assignment_01;

public class GreaterNum {
    public static void main(String[] args) {
    	int n = 456975962;
        int max = Integer.MIN_VALUE;
        while(n!=0) {
        	int rem = n%10;
        	if(max<rem) {
        		max = rem;
        	}
        	n = n/10;
        }
        System.out.println(max);
    }
}
//Time complexity : O(N)
//Space complecxity : O(1)