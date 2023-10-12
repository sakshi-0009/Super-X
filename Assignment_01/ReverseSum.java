//WAP to reverse a number and put successive number sum into an array and print it :
//Incomplete

package Assignment_01;
public class ReverseSum {

    public static void main(String[] args) {
        int n = 45689;
        int temp = n;
        int count = 0;
        int sum = 0;
        while(temp != 0) {
        	count++;
        	temp = temp/10;
        }
        int arr[] = new int[count];
        int j=0;
        while( n != 0) {
        	int rem = n%10;
        	arr[j++]=rem;
        	n = n/10;
        }
        for(int i=0; i<arr.length-1; i++) {
        	arr[i] = arr[i]+arr[i+1];
        	System.out.print(arr[i]+" ");
        }
        System.out.println(arr[arr.length-1]);
        System.out.println();
    }
}
//Time complexity : O(N)
//Space complexity : (1)