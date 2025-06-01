package com.learning;

public class Pascal {
	public static void main(String[] a) {

		  int n = 10; // Change this value to control the number of rows

	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }

	            // Print numbers in ascending order
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }

	            // Print numbers in descending order excluding the last one
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }

	            // Move to the next line for the next row
	            System.out.println();
	            
	            
	            
	        }  
	            
	          //  int n = 5; // Change this value to control the number of rows

	            for (int i = 0; i < n; i++) {
	                int number = 1;

	                // Print leading spaces
	                for (int j = 0; j < n - i; j++) {
	                    System.out.print(" ");
	                }

	                for (int j = 0; j <= i; j++) {
	                    // Calculate and print the current number
	                    System.out.print(number + " ");

	                    // Calculate the next number using the previous one
	                    number = number * (i - j) / (j + 1);
	                }

	                // Move to the next line for the next row
	                System.out.println();
	            }
	        
	}

}
