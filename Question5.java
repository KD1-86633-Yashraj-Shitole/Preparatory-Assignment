// Write a program to check the input characters for uppercase, 
// lowercase, number of digits and other characters. Display appropriate 
// message.
import java.util.Scanner;


public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isUpperCase(ch)) {
            System.out.println("The character '" + ch + "' is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("The character '" + ch + "' is a lowercase letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println("The character '" + ch + "' is a digit.");
        } else {
            System.out.println("The character '" + ch + "' is other character.");
        }

    }
}
