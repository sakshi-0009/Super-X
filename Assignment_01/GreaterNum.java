package Assignment_01;

public class GreaterNum {
    public static void main(String[] args) {
    	int input = 456975962;

        String inputString = String.valueOf(input);
        int maxDigit = Integer.MIN_VALUE;
        int number = -1;

        for (int i = 0; i < inputString.length(); i++) {
            int currentDigit = Character.getNumericValue(inputString.charAt(i));

            if (currentDigit >= maxDigit) {
                maxDigit = currentDigit;
            } else {
                number = currentDigit;
                break;
            }
        }
        if (number != -1) {
            System.out.println("The number is: " + number);
        } else {
            System.out.println("No such number found.");
        }
    }
}

