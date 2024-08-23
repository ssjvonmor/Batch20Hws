package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Print prompt for user to enter their mark
        System.out.println("Please enter your mark");
        // Capture the mark input
        int marks = input.nextInt();


        // Determine the grade based on the mark


        if (marks > 1 && marks <= 25) {
            String grade = "F";
            System.out.println("Your grade is " + grade);
        }
        if (marks >= 26 && marks <= 45) {
            String grade = "E";
            System.out.println("Your grade is " + grade);
        }
        if (marks >= 46 && marks <= 50) {
            String grade = "D";
            System.out.println("Your grade is " + grade);
        }
        if (marks >= 51 && marks <= 60) {
            String grade = "C";
            System.out.println("Your grade is " + grade);
        }
        if (marks >= 61 && marks <= 80) {
            String grade = "B";
            System.out.println("Your grade is " + grade);
        }
        if (marks >= 81 && marks <= 100) {
            String grade = "A";
            System.out.println("Your grade is " + grade);
        }
        if (marks < 1 || marks > 100) {
            System.out.println("Please enter valid mark");
        }


        // Print the grade
        // Output: Your grade is ____


    }
}
