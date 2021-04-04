package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
                if (board[i][i] == 1 && (monoHorizontal(board, i) || monoVertical(board, i))) {
                    rsl = true;
                    break;
                }
            }
        return rsl;
    }
    public static boolean monoVertical(int[][] board, int column) {
        boolean result1 = true;
        for (int i = 0; i < board.length; i++) {
           if (1 != board[i][column]) {
              result1 = false;
                 break;
            }
        }
        return result1;
    }
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        int rsl = 1;
        for (int i = 0; i < board[row].length; i++) {
            if (rsl != board[row][i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
