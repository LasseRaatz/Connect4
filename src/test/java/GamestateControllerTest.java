import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GamestateControllerTest {
    private static final int NUMBER_OF_COLUMNS = 7;
    private static final int NUMBER_OF_ROWS = 6;

    private static GamestateController gamestateController;

    private static UnmodifiableGameboard gameboardWithHorizontalLine;
    private static UnmodifiableGameboard gameboardWithVerticalLine;
    private static UnmodifiableGameboard gameboardWithDownwardsDiagonalLine;
    private static UnmodifiableGameboard gameboardWithUpwardsDiagonalLine;
    private static UnmodifiableGameboard gameboardEmpty;

    @BeforeAll
    static void setup() {
        gamestateController = new GamestateControllerImpl(); //TODO: The implementation should probably be injected by specific class tests.

        gameboardWithHorizontalLine = getUnmodifiableGameboardWithHorizontalLine();
        gameboardWithVerticalLine = getUnmodifiableGameboardWithVerticalLine();
        gameboardWithDownwardsDiagonalLine = getUnmodifiableGameboardWithDownwardsDiagonalLine();
        gameboardWithUpwardsDiagonalLine = getUnmodifiableGameboardWithUpwardsDiagnoalLine();
        gameboardEmpty = getUnmodifiableGameboardEmpty();
    }

    private static UnmodifiableGameboard getUnmodifiableGameboardWithHorizontalLine() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    private static UnmodifiableGameboard getUnmodifiableGameboardWithVerticalLine() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    private static UnmodifiableGameboard getUnmodifiableGameboardWithDownwardsDiagonalLine() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    private static UnmodifiableGameboard getUnmodifiableGameboardWithUpwardsDiagnoalLine() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    private static UnmodifiableGameboard getUnmodifiableGameboardEmpty() {
        return new UnmodifiableGameboard(new GameboardImpl(NUMBER_OF_COLUMNS, NUMBER_OF_ROWS));
    }

    /**
     * Test that isWinningMove() correctly identifies wining move in horizontal line
     */
    @Test
    void testIsWinningMoveHorizontal() {
        //Initialization
        Gameboard gameboard = gameboardWithHorizontalLine;

        //Expected
        boolean expected = true;

        //Actual
        boolean actual = gamestateController.isWinningMove(gameboard, 0); //TODO: Insert correct column

        //Assertion
        assertEquals(expected, actual);
    }

    /**
     * Test that isWinningMove() correctly identifies wining move in vertical line
     */
    @Test
    void testIsWinningMoveVertical() {
        //Initialization
        Gameboard gameboard = gameboardWithVerticalLine;

        //Expected
        boolean expected = true;

        //Actual
        boolean actual = gamestateController.isWinningMove(gameboard, 0); //TODO: Insert correct column

        //Assertion
        assertEquals(expected, actual);
    }

    /**
     * Test that isWinningMove() correctly identifies wining move in a downwards diagonal line
     */
    @Test
    void testIsWinningMoveDownwardsDiagonal() {
        //Initialization
        Gameboard gameboard = gameboardWithDownwardsDiagonalLine;

        //Expected
        boolean expected = true;

        //Actual
        boolean actual = gamestateController.isWinningMove(gameboard, 0); //TODO: Insert correct column

        //Assertion
        assertEquals(expected, actual);
    }

    /**
     * Test that isWinningMove() correctly identifies wining move in an upwards diagonal line
     */
    @Test
    void testIsWinningMoveUpwardsDiagonal() {
        //Initialization
        Gameboard gameboard = gameboardWithUpwardsDiagonalLine;

        //Expected
        boolean expected = true;

        //Actual
        boolean actual = gamestateController.isWinningMove(gameboard, 0); //TODO: Insert correct column

        //Assertion
        assertEquals(expected, actual);
    }

    /**
     * Test that isWinningMove() correctly identifies no winning move when the board is empty.
     */
    @Test
    void testIsWinningMoveEmpty() {
        //Initialization
        Gameboard gameboard = gameboardEmpty;

        //Expected
        boolean expected = false;

        //Actual
        boolean actual = gamestateController.isWinningMove(gameboard, 0); //TODO: Insert correct column

        //Assertion
        assertEquals(expected, actual);
    }
}
