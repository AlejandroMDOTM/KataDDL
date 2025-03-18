package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void liveCellWithLessThanTwoNeighboursDies() {
        boolean[][] board={
                { false, false, false, false },
                { false, false, true, false },
                {false, false, false, true },
        };
        boolean[][] result = GameOfLife.gameOfLife(board);
         board= new boolean[][]{
                 {false, false, false, false},
                 {false, false, false, false},
                 {false, false, false, false},
         };
        assertArrayEquals(board, result);
    }

    @Test
    void liveCellWithMoreThanThreeNeighboursDies() {
        boolean[][] board={
                { false, false, true, false },
                { false, true, true, true },
                {false, false, true, false },
        };
        boolean[][] result = GameOfLife.gameOfLife(board);
        board= new boolean[][]{
                {false, false, true, false},
                {false, true, false, true},
                {false, false, true, false},
        };
        assertArrayEquals(board, result);
    }

    @Test
    void secondTestliveCellWithMoreThanThreeNeighboursDies() {
        boolean[][] board={
                { false, true, true, false },
                { false, true, true, true },
                {false, false, true, false },
        };
        boolean[][] result = GameOfLife.gameOfLife(board);
        board= new boolean[][]{
                {false, true, false, false},
                {false, false, false, true},
                {false, false, true, false},
        };
        assertArrayEquals(board, result);
    }

}