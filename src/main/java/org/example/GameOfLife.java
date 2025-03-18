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
                if (board[row][col])
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
        return board;
    }


}