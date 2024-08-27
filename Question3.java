
//Write a program to calculate Fibonacci Series up to n numbers
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get Fibonacci series");
        int number = sc.nextInt();
        int prev = 0;
        int curr = 1;
        System.out.println("Series: ");
        System.out.print("0" + " ");
        for (int i = 0; i <= number; i++) {
            System.out.print(curr + " ");
            int temp = prev;
            prev = curr;
            curr = temp + curr;
        }
        sc.close();
    }
}

// Enter number to get Fibonacci series
// 10
// Series:
// 0 1 1 2 3 5 8 13 21 34 55 89