package org.example.e67;

public class E67Arrays {
    public static void main(String[] args) {
        // Create an array of integers and store the values 45, 78, 12, 67, 55, 89, 23, 77, and 88
        int[] num={45, 78, 12, 67, 55, 89, 23, 77, 88};


        // Use a loop to iterate through the array and print the values at even indices followed by a space
        for (int i = 0; i < num.length ; i++) {
            if (i%2==0){
                System.out.print(num[i]+" ");
            }

        }
        System.out.println();
    }
}
