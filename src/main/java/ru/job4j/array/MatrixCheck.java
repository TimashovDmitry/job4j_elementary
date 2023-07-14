package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int stl = 0; stl < board.length - 1; stl++) {
                if ((board[row][stl] & board[row][stl + 1]) != 'X') {
                   result = false;
                }

        }
        return result;

    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int stl = 0; stl < board.length - 1; stl++) {
            if ((board[stl][column] & board[stl + 1][column]) != 'X') {
                result = false;
            }

        }
        return result;
    }
}
