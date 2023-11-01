package Day_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutomorphicNumber {

	static boolean Automorphic(int num){
        int sqr = num*num;
        while (num > 0) { 
            if (num % 10 != sqr % 10) 
                return false; 
            num /= 10; 
            sqr /= 10; 
        } 
        return true;
    }
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());
        System.out.println(Automorphic(num));
    }
}
