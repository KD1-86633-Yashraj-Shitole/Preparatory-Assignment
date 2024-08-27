// Accept an integer number and when the program is executed print the
// binary, octal and hexadecimal equivalent of the given number.
// Sample Output:
// Enter Number : 20
// Given Number :20
// Binary equivalent :10100
// Octal equivalent :24
// Hexadecimal equivalent :14
// Hint: Use bitwise operators for binary conversion. Octal/Hexadecimal
// conversion to be done by repetitive division using recursion.

import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        

         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        System.out.println("Given Number: " + number);

        String binary = NumberConversion.toBinary(number);
        System.out.println("Binary equivalent: " + binary);

        String octal = NumberConversion.toOctal(number);
        System.out.println("Octal equivalent: " + (octal.isEmpty() ? "0" : octal));

        String hexadecimal = NumberConversion.toHexadecimal(number);
        System.out.println("Hexadecimal equivalent: " + (hexadecimal.isEmpty() ? "0" : hexadecimal));

    }



    public class NumberConversion {

        public static String toBinary(int number) {
            StringBuilder binary = new StringBuilder();
            while (number > 0) {
                binary.insert(0, (number & 1));
                number = number >> 1;
            }
            return binary.length() > 0 ? binary.toString() : "0";
        }
    
        public static String toOctal(int number) {
            if (number == 0) {
                return "";
            }
            return toOctal(number / 8) + (number % 8);
        }
    
        public static String toHexadecimal(int number) {
            if (number == 0) {
                return "";
            }
            int remainder = number % 16;
            char hexChar = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
            return toHexadecimal(number / 16) + hexChar;
        }

    }
}
