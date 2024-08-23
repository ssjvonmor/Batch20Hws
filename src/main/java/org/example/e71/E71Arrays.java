package org.example.e71;

public class E71Arrays {
    public static void main(String[] args) {
        // Create an array of integers with the values {45, 78, 12, 67, 55, 89, 23, 77, 88}
        int[] x={45, 78, 12, 67, 55, 89, 23, 77, 88};
        for (int i = 0; i < x.length ; i++) {

            if (x[i]==78||x[i]==55||x[i]==77){
                System.out.print(x[i]+" ");
            }


        }
        System.out.println();


        // Use a loop to iterate through the array and print the values at specific indices to get the result 78, 55, 77




    }
}
