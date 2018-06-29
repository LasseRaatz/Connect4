import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameboardTest {

    private Gameboard board;

    public GameboardTest(Gameboard board) {
        this.board = board;
    }

    @Test
    void putPegAndGetOwnerOfPeg() {
        int column = board.getNumberOfColumns()-1;
        for (int i = 0; i < board.getNumberOfRows()-1; i++) {
            board.putPeg(i, column);
        }
        for (int i = 0; i < board.getNumberOfRows()-1; i++) {
            assertEquals(i, board.getOwnerOfPeg(column, i));
        }
    }

    @Test
    void getColumnSize() {
        for (int i = 0; i < board.getNumberOfColumns(); i++) {
            for (int j = 0; j < board.getNumberOfRows() - i; j++) {
                board.putPeg(1, i);
            }
        }
        for (int i = 0; i < board.getNumberOfColumns(); i++) {
            for (int j = 0; j < board.getNumberOfRows() - i; j++) {
                assertEquals(board.getNumberOfRows() - i, board.getColumnSize(i));
            }
        }
    }

}