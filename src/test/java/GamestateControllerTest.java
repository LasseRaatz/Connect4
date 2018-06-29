import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GamestateControllerTest {
    Gameboard gameboardWithHorizontalLine;
    Gameboard gameboardWithVerticalLine;
    Gameboard gameboardWithDownwardsDiagonalLine;
    Gameboard gameboardWithUpwardsDiagonalLine;

    @BeforeAll
    void setup() {
        //gameboardWithHorizontalLine = new Gameboard();
        //gameboardWithVerticalLine = new Gameboard();
        //gameboardWithDownwardsDiagonalLine = new Gameboard();
        //gameboardWithUpwardsDiagonalLine = new Gameboard();
    }

    /**
     * Test that isWinningMove() correctly identifies wining move in horizontal line
     */
    @Test
    void testIsWinningMoveHorizontal() {
        //Initialization
        //Gameboard gameboard = new Gameboard();

        //Expected
        boolean expected = true;

        //Actual
        //boolean actual = isWinningMove(0);

        //Assertion
        //assertEquals(expected, actual);
    }

    /**
     * Test that isWinningMove() correctly identifies wining move in vertical line
     */
    @Test
    void testIsWinningMoveVertical() {
        //Initialization
        //Gameboard gameboard = new Gameboard();

        //Expected
        boolean expected = true;

        //Actual
        //boolean actual = isWinningMove(0);

        //Assertion
        //assertEquals(expected, actual);
    }

    /**
     * Test that isWinningMove() correctly identifies wining move in a downwards diagonal line
     */
    @Test
    void testIsWinningMoveDownwardsDiagonal() {
        //Initialization
        //Gameboard gameboard = new Gameboard();

        //Expected
        boolean expected = true;

        //Actual
        //boolean actual = isWinningMove(0);

        //Assertion
        //assertEquals(expected, actual);
    }

    /**
     * Test that isWinningMove() correctly identifies wining move in upwards diagonal line
     */
    @Test
    void testIsWinningMoveUpwardsDiagonal() {
        //Initialization
        //Gameboard gameboard = new Gameboard();

        //Expected
        boolean expected = true;

        //Actual
        //boolean actual = isWinningMove(0);

        //Assertion
        //assertEquals(expected, actual);
    }

    /**
     * Test that isWinningMove() correctly identifies no winning move when the board is empty.
     */
    @Test
    void testIsWinningMoveEmpty() {
        //Initialization
        //Gameboard gameboard = new Gameboard();

        //Expected
        boolean expected = false;

        //Actual
        //boolean actual = isWinningMove(0);

        //Assertion
        //assertEquals(expected, actual);
    }
}
