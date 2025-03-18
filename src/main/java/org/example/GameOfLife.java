package org.example;

public class GameOfLife {

    public static void main(String[] args) {
        /*
        boolean[][] board={
                { false, false, false, false },
                { false, false, true, false },
                {false, false, false, true },
        };
        gameOfLife(board);
         */
    }

    public static boolean[][] gameOfLife(boolean[][] board) {
        boolean[][] state = new boolean[board.length][];
        for (int i = 0; i < board.length; i++) {
            state[i] = board[i].clone();
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (neighboursCheckOneZeroOrMoreThanThree(board, row, col))
                    state[row][col]=false;
            }
        }
        for (int row = 0; row < state.length; row++) {
            for (int col = 0; col < state[row].length; col++) {
                if (state[row][col])
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
        return state;
    }

    public static boolean neighboursCheckOneZeroOrMoreThanThree(boolean[][] board, int row, int col) {
        int trueCount = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int neighbourRow = row + i;
                int neighbourCol = col + j;
                if (neighbourRow >= 0 && neighbourRow<board.length && neighbourCol >= 0 && neighbourCol < board[neighbourRow].length) {
                    if (board[neighbourRow][neighbourCol]) {
                        trueCount++;
                    }
                }
            }
        }
        return trueCount<2||trueCount>3? true : false;
    }

}