package org.example;

import java.util.Arrays;

public class Main3 {
    public static void setZeroes(int[][] matrix) {
        int[] rowsZero = new int[matrix.length];
        int[] colsZero = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsZero[i] = 1;
                    colsZero[j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rowsZero[i] == 1 || colsZero[j] == 1)
                    matrix[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}