package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        // Capture the meal type input
        int coffeeType= input.nextInt();



        // Print the price
        switch (coffeeType) {

            case 1:
                double cost = 3.00;
                System.out.println("The price of your coffee is $"+cost);
                break;
            case 2:
                cost = 4.00;
                System.out.println("The price of your coffee is $"+cost);
                break;
            case 3:
                cost = 4.50;
                System.out.println("The price of your coffee is $"+cost);
                break;
            case 4:
                cost=5.00;
                    System.out.println("The price of your coffee is $"+cost);
                    break;
            default:
                System.out.println("Invalid coffee type entered");
        }

        // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        // Capture the coffee type input

        // Print the price
        // Output: The price of your coffee is $____
    }
}
