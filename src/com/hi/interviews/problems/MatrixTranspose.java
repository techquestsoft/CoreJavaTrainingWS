package com.hi.interviews.problems;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Input the matrix elements
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpose the matrix
        int[][] transposedMatrix = transposeMatrix(matrix, rows, columns);

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix, rows, columns);

        // Display the transposed matrix
        System.out.println("Transposed Matrix:");
        displayMatrix(transposedMatrix, columns, rows);

        scanner.close();
    }

    // Function to transpose a matrix
    private static int[][] transposeMatrix(int[][] matrix, int rows, int columns) {
        int[][] result = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

