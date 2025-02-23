package tictactoe.test;
import org.junit.jupiter.api.Test;
import tictactoegame.TicTacToe;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TicTacToeTest {
    @Test
    public void testInvalidMoveOutOfBoundsX() {
        TicTacToe game = new TicTacToe();
        Exception exception = assertThrows(RuntimeException.class, () -> game.play(3, 0));
        assertEquals("Invalid move: Out of bounds", exception.getMessage());
    }

    @Test
    public void testInvalidMoveOutOfBoundsY() {
        TicTacToe game = new TicTacToe();
        Exception exception = assertThrows(RuntimeException.class, () -> game.play(0, 3));
        assertEquals("Invalid move: Out of bounds", exception.getMessage());
    }

    @Test
    public void testOccupiedCell() {
        TicTacToe game = new TicTacToe();
        game.play(0, 0);
        Exception exception = assertThrows(RuntimeException.class, () -> game.play(0, 0));
        assertEquals("Cell already occupied", exception.getMessage());
    }

    @Test
    public void testPlayerAlternation() {
        TicTacToe game = new TicTacToe();
        assertEquals('X', game.getCurrentPlayer());
        game.play(0, 0);
        assertEquals('O', game.getCurrentPlayer());
    }

    @Test
    public void testWinningConditionRow() {
        TicTacToe game = new TicTacToe();
        game.play(0, 0);
        game.play(1, 0);
        game.play(0, 1);
        game.play(1, 1);
        game.play(0, 2);
        assertEquals("Player X wins!", game.checkWinner());
    }
}
