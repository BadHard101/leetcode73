package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class Main1 {
    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rowsSet = new HashSet<>();
        HashSet<Integer> columnsSet = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsSet.add(i);
                    columnsSet.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rowsSet.contains(i) || columnsSet.contains(j))
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