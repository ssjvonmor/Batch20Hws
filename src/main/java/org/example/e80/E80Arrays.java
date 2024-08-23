package org.example.e80;

public class E80Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum=0;
        int row=0;
        int total=0;

        for (int [] aNum:a){

            for (int aNumA:aNum){

                if (aNumA%2==-1 && aNumA<0){
                    sum++;

                }
            }

        }
        System.out.println(sum);

        // Use nested loops to iterate through the 2D array and count the elements that are both negative and odd

        // Print the total count of elements that are both negative and odd
    }
}
