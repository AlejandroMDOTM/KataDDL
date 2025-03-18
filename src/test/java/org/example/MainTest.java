package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void liveCellWithLessThanTwoNeighboursDies() {
        GameOfLife gameOfLife = new GameOfLife();
        boolean[][] board={
                { false, false, false, false },
                { false, false, true, false },
                {false, false, false, true },
        };
        boolean[][] result = GameOfLife.gameOfLife(board);
        assertEquals(board, result);
    }

}