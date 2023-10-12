//WAP to convert all even indices of string to uppercase and odd indices to lowercase :

package Assignment_01;
public class StringConversion {

	public static void main(String[] args) {
		String str = "dFTbnSrOvryt";

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                ans.append(Character.toUpperCase(ch));
            } else {
                ans.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(ans.toString());
	}
}
//Time complexity : O(N)
//Space complexity : O(1)