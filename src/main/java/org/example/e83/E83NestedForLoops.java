package org.example.e83;

public class E83NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];

        table[0][0]=1;
        table[1][0]=2;
        table[2][0]=3;
        table[3][0]=4;
        table[4][0]=5;

        table[0][0]=1;
        table[0][1]=2;
        table[0][2]=3;
        table[0][3]=4;
        table[0][4]=5;
        table[0][5]=6;
        table[0][6]=7;
        table[0][7]=8;
        table[0][8]=9;
        table[0][9]=10;


        // Use nested loops to fill the 2D array with multiplication table values
        for (int i = 0; i <=4 ; i++) {



            for (int j =0 ; j <= 9 ; j++) {
                System.out.print(table[i][0]*table[0][j]+" ");

            }
            System.out.println();

        }

        // Use nested loops to iterate through the 2D array and print the pattern

    }
}
