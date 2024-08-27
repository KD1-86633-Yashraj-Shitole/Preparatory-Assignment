// Write a program to input n numbers on command line argument and 
// calculate maximum of them.

import java.util.ArrayList;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers or type X to end inputs");
        while (true) {
            String input = sc.next();
            if (input.equals("x") || input.equals("X")) {
                break;
            } else {
                numbers.add(Integer.parseInt(input));
            }
        }
        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("Largest number is: "+max);
        sc.close();
    }
}

// Enter numbers or type X to end inputs
// 1 28 99 34 1 88 x
// Largest number is: 99
