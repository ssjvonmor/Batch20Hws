package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to enter their electricity usage in kWh
        System.out.println("Enter your electricity usage in kWh");
        // Capture the usage input
        int usage= input.nextInt();
        double rate=0.12;
        double rate1=0.15;
        double rate3=.20;
        double rate4=.25;
        if(usage>=1&&usage<=100){
           usage*=rate;
            System.out.println(usage);
        }

        // Calculate bill using switch statement
        switch (usage){
            case 1100:
                //double finalRate=usage*=rate;
                System.out.println("$");
                break;
        }
        switch (usage){
            case 101-200:
        }

        // Print the bill
        // Output: Your electricity bill is $____

    }
}
