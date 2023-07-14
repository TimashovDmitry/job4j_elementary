package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 1; row <= size; row++) {
            for (int cell = 1; cell <= size; cell++) {
                int val = row * cell;
                array[cell - 1][row - 1] = val;
            }
        }
        return array;
    }
}