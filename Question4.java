// Q4. Write a program to calculate the grade of a student. There are five
// subjects. Marks in each subject are entered from keyboard. Assign grade
// based on the following rule:
// Total Marks >= 90   Grade: Ex
// 90 > Total Marks >= 80  Grade: A
// 80 > Total Marks >= 70  Grade: B
// 70 > Total Marks >= 60  Grade: C
// 60 > Total Marks    Grade: F

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        int[] subjectMarks=new int[5];

        Scanner sc=new Scanner(System.in);
        int totalMarks=0;

        for(int i=0;i<subjectMarks.length;i++){

            subjectMarks[i]=sc.nextInt();
            totalMarks+=subjectMarks[i];

        }

        char grade;

        int percent=totalMarks/5;

        if (percent>=90) {
            grade='S';
            System.out.println("Grade is Ex");
        }
        else if (percent>=80 && percent<90){
            grade='A';
            System.out.println("Grade is A");
        }
        else if (percent>=70 && percent<80){
            grade='B';
            System.out.println("Grade is A");
        }
        else if (percent>=60 && percent<70){
            grade='C';
            System.out.println("Grade is A");
        }
        else{
            grade='D';
            System.out.println("Grade is A");
        }
}
    }



