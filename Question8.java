// Write a program to read the name of a student (studentName), roll
// Number (rollNo) and marks (totalMarks) obtained. rollNo may be an
// alphanumeric string. Display the data as read. Hint: Create a Student
// structure and write appropriate functions.

import java.util.Scanner;



public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter the student's roll number: ");
        String rollNo = scanner.nextLine();
        
        System.out.print("Enter the student's total marks: ");
        int totalMarks = scanner.nextInt();
        
        Student student = new Student(studentName, rollNo, totalMarks);
        
        System.out.println("\nStudent Details:");
        student.displayStudentData();

    }
}


class Student {
    private String studentName;
    private String rollNo;  
    private int totalMarks;

    public Student(String studentName, String rollNo, int totalMarks) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public void displayStudentData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }
}
