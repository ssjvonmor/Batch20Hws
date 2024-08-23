package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][11];

        table[0][0]=6;
        table[1][0]=7;
        table[2][0]=8;
        table[3][0]=9;
        table[4][0]=10;

        table[0][1]=1;
        table[0][2]=2;
        table[0][3]=3;
        table[0][4]=4;
        table[0][5]=5;
        table[0][6]=6;
        table[0][7]=7;
        table[0][8]=8;
        table[0][9]=9;
        table[0][10]=10;






        // Use nested loops to fill the 2D array with multiplication table values
        for (int i = 0; i <=4 ; i++) {





            for (int j =1 ; j <= 10 ; j++) {
                System.out.print(table[i][0]*table[0][j]+" ");

            }
            System.out.println();

        }


        // Use nested loops to fill the 2D array with multiplication table values

        // Use nested loops to iterate through the 2D array and print the pattern

    }
}
