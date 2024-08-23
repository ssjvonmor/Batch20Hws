package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;
        int row = 0;
        int total = 0;

        for (int[] aNum : a) {
            for (int i = 0; i < aNum.length; i++) {

            }
            for (int aNumA : aNum) {
                if (aNumA % 2 == 0 && aNumA < -3) {
                    System.out.println(aNumA);
                }
            }
        }


        // Use nested loops to iterate through the 2D array and sum the elements that are on even indexes and even rows

        // Print the calculated sum
    }
}
