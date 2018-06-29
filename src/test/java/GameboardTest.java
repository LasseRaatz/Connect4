import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameboardTest {

    private Gameboard board;

    public GameboardTest(Gameboard board) {
        this.board = board;
    }

    @Test
    void putPegAndGetOwnerOfPeg() {
        if (board.getNumberOfRows() < 3) throw new IllegalArgumentException("The given Gameboard does not have enough rows to be tested");
        board.putPeg(1,board.getNumberOfColumns()-1);
        board.putPeg(2,board.getNumberOfColumns()-1);
        board.putPeg(1,board.getNumberOfColumns()-1);
        assertEquals(1, board.getOwnerOfPeg(board.getNumberOfColumns()-1,0));
        assertEquals(2, board.getOwnerOfPeg(board.getNumberOfColumns()-1,1));
        assertEquals(1, board.getOwnerOfPeg(board.getNumberOfColumns()-1,2));
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