package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);


        // Print prompt for user to answer if they are thirsty
        System.out.println("Are you thirsty? (true/false)");
        // Capture the thirsty input
        boolean isThirsty= input.nextBoolean();

        // Print prompt for user to answer if they are sleepy
        System.out.println("Are you sleepy? (true/false)");
        // Capture the sleepy input
        boolean isSleepy= input.nextBoolean();

        // Determine the drink based on the inputs

        if (isThirsty&&isSleepy==false){
            String drink="water";
            System.out.println("Looks like you need to drink "+drink);
        }
        if (isSleepy&&isThirsty){
            String drink="coffee";
            System.out.println("Looks like you need to drink "+drink);
        }
        if (isSleepy&&isThirsty==false){
            String drink="tea";
            System.out.println("Looks like you need to drink "+drink);
        }
        if (isSleepy==false&&isThirsty==false){
            String drink="nothing";
            System.out.println("Looks like you need to drink "+drink);
        }

        // Print the drink suggestion
        // Output: Looks like you need to drink ___
    }
}
