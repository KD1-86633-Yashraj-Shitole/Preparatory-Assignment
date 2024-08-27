// Write a program to calculate a Factorial of a number.

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get its factorial");
        int number = sc.nextInt();
        long answer = 1;
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                answer = answer * i;
            }
            System.out.println("Answer: " + answer);
        } else {
            System.out.println("Answer: 0");
        }
        sc.close();
    }
}

// Enter number to get its factorial
// 5
// Answer: 120
