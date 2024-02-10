package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
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

        for (Integer i : rowsSet) {
            Arrays.fill(matrix[i], 0);
        }
        for (Integer j : columnsSet) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
}