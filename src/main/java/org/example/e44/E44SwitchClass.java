package org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        // Capture the meal type input
        int mealType= input.nextInt();



        // Print the price
        switch (mealType){

            case 1:
                double cost=5.00;
                System.out.println("The price of your meal is $"+cost);
                break;
            case 2:
                cost=10.00;
                System.out.println("The price of your meal is $"+cost);
                break;
            case 3:
                cost=15.00;
                System.out.println("The price of your meal is $"+cost);
                break;
            default:
                System.out.println("Invalid meal type entered");
        }
        // Output: The price of your meal is $____



        // Print the price

    }
}
