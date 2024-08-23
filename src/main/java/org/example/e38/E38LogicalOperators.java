package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to answer if it is the weekend
        System.out.println("Is it weekend? (true/false)");
        // Capture the weekend input
        boolean isWeekend= input.nextBoolean();
        System.out.println("Are you available? (true/false)");
        boolean isAvailable= input.nextBoolean();

        if (isWeekend&&isAvailable){
            String subject="Java";
            System.out.println("Today you will be learning "+subject);
        }
        isWeekend=!isWeekend;
        if (isWeekend&&isAvailable){
            String subject="manual testing";
            System.out.println("Today you will be learning "+subject);
        }
        isWeekend=!isWeekend;
        isAvailable=!isAvailable;
        if (isAvailable){
            String subject="no subject";
            System.out.println("Today you will be learning "+subject);
        }
        isWeekend=!isWeekend;
        isAvailable=!isAvailable;

        // Determine the subject based on the input
        // If it is the weekend
        //    Set subject to "Java"
        // Otherwise
        //    Set subject to "manual testing"

        // Print the subject suggestion
        // Output: Today you will be learning ____


    }
}
