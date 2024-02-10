package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class Main2 {
    public static void setZeroes(int[][] matrix) {
        int[] rowsZero = new int[matrix.length];
        int[] colsZero = new int[matrix[0].length];
        Arrays.fill(rowsZero, 1);
        Arrays.fill(colsZero, 1);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsZero[i] = 0;
                    colsZero[j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rowsZero[i] == 0 || colsZero[j] == 0)
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