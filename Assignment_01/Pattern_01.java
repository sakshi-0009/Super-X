package Assignment_01;

public class Pattern_01 {

	public static void main(String[] args) {
		int ch1 = 65;
		int ch2 = 97;
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i%2==1) {
					System.out.print((char)(ch1+n-1)+" ");
					ch1--;
				}else {
					System.out.print((char)(ch2+n+1)+" ");
					ch2++;
				}
			}
			ch1 = ch1+n-1;
			ch2--;
			System.out.println();
		}
	}
}
