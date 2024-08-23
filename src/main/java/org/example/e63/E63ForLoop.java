package org.example.e63;

import java.util.Scanner;

public class E63ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input=new Scanner(System.in);


        // Prompt the user to enter a value for x
        System.out.print("In: ");
        int in= input.nextInt();


        // Use a for loop that starts with i = 0 and continues while i < x
        // Inside the loop, print the value of i followed by a space
        for (int i = 0; i < in; i++) {
            System.out.print(i+" ");

        }

    }
}
