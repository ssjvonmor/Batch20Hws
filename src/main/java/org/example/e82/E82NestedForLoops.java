package org.example.e82;

public class E82NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given pattern values
        String[][] pattern = {
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}
        };

        for (String[] pattern1:pattern){


            for (String patternA:pattern1){
                System.out.print(patternA+" ");
            }
            System.out.println();
        }

        // Use nested loops to iterate through the 2D array and print the pattern

    }
}
