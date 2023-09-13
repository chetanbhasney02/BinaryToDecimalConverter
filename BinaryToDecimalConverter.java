package task;

import java.util.Scanner;

public class BinaryToDecimalConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = convertBinaryToDecimal(binary);
        System.out.println("Decimal Equivalent: " + decimal);
    }

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        // Start from the rightmost bit (LSB) of the binary number
        for (int i = binary.length() - 1; i >= 0; i--) {
            // Check if the current bit is 1
            if (binary.charAt(i) == '1') {
                // Calculate the decimal value of the current bit
                int value = (int) Math.pow(2, power);
                // Add the decimal value to the result
                decimal += value;
            }
            // Increment the power for the next bit
            power++;
        }

        return decimal;
    }
}

