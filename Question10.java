// Read at most 10 names of students and store them into an array of
// char nameOfStudents[10][50]. Sort the array and display them back. Hint:
// Use qsort() method.
import java.util.Arrays;
import java.util.Scanner;


public class Question10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        final int MAX_STUDENTS = 10;
        final int NAME_LENGTH = 50;

        String[] nameOfStudents = new String[MAX_STUDENTS];

        System.out.println("Enter up to " + MAX_STUDENTS + " student names:");
        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.print("Enter name of student " + (i + 1) + " (or press Enter to finish): ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            nameOfStudents[i] = name;
        }

        int actualSize = 0;
        for (String name : nameOfStudents) {
            if (name != null) {
                actualSize++;
            }
        }
        String[] trimmedNames = Arrays.copyOf(nameOfStudents, actualSize);

        Arrays.sort(trimmedNames);

        System.out.println("\nSorted names:");
        for (String name : trimmedNames) {
            System.out.println(name);
        }

    }
}
