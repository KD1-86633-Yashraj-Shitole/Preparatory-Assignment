//  Write a program to accept a number from user using command line argument and display its table.

public class Question7 {
    public static void main(String[] args) {
  
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);

        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

}
