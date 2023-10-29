package com.techquestsoft.training.arrays;

//Java Program to multiply two matrices  
public class MatrixMultiplicationExample {
	public static void main(String args[]) {
		//creating two matrices    
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 3, 5 }, { 2, 4, 6 }, { 7, 8, 9 } };

		//creating another matrix to store the multiplication of two matrices    
		int c[][] = new int[3][3]; // 3 rows and 3 columns

		//multiplying and printing multiplication of 2 matrices    
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				} // end of k loop
				System.out.print(c[i][j] + " "); // printing matrix element
			} // end of j loop
			System.out.println();// new line
		}
	}
}
