package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);


        // Create an array of strings with size 7
        String[] day = new String[7];
        day[0] = "Sunday";
        day[1] = "Monday";
        day[2] = "Tuesday";
        day[3] = "Wednesday";
        day[4] = "Thursday";
        day[5] = "Friday";
        day[6] = "Saturday";


        // Use a loop to prompt the user to input the days of the week one by one and store each input in the array
        for (int i = 1; i <= 7; i++) {
            System.out.println("Please enter day " + i + " of the week");
            String weekday = input.next();


        }
        for (int i = 0; i < 7; i++) {
            System.out.println(day[i]);
        }

        // Use another loop to iterate through the array and print each value on a new line

        // Create a Scanner object to read input from the console



    }
}
