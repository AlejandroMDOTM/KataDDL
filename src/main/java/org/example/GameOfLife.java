package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (neighboursCheckOneOrZero(board, row, col))
                    board[row][col]=false;
                if (board[row][col])
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
        return board;
    }

    public static boolean neighboursCheckOneOrZero(boolean[][] board, int row, int col) {
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
     return trueCount<2 ? true : false;
    }

}