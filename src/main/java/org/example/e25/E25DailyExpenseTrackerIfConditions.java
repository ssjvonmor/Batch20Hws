package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
double morningExpense=25.50;
double afternoonExpense=25.0;
double eveningExpense=25.75;


        // Calculate total expense
        double totalExpense=morningExpense+afternoonExpense+eveningExpense;


        // Define a budget
        double budget=100.0;


        // Check if within budget
        if (budget>totalExpense){
            System.out.println("Your total daily expense is: "+totalExpense);
            System.out.println("You are within the budget.");
        }


    }
}
