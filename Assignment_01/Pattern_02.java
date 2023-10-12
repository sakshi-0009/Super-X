//Print pattern :

package Assignment_01;

public class Pattern_02 {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'a';
		int n = 5;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				if(i%2==0){
					if(j%2==0)
						System.out.print(ch1+" ");
					else
						System.out.print(ch2+" ");
					ch1++;
					ch2++;
				}
				else {
					ch1--;
					ch2--;
					if(j%2==1)
						System.out.print(ch1+" ");
					else	
						System.out.print(ch2+" ");
				}
			}	
			System.out.println();
		}
	}
}
//Time complexity : O(N^2)
//Space complexity : O(1)