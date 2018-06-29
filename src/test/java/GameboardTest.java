import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameboardTest {

    private Gameboard board;

    public GameboardTest(Gameboard board) {
        this.board = board;
    }

    @Test
    void putPegAndGetOwnerOfPeg() {
        board.putPeg(1,1);
        board.putPeg(2,1);
        board.putPeg(1,1);
        assertEquals(1, board.getOwnerOfPeg(1,1));
        assertEquals(2, board.getOwnerOfPeg(1,2));
        assertEquals(1, board.getOwnerOfPeg(1,3));
    }

    @Test
    void getColumnSize() {
        for (int i = 0; i < 3; i++) board.putPeg(1,1);
        for (int i = 0; i < 2; i++) board.putPeg(1,2);
        for (int i = 0; i < 1; i++) board.putPeg(1,3);
        assertEquals(3, board.getColumnSize(1));
        assertEquals(2, board.getColumnSize(2));
        assertEquals(1, board.getColumnSize(3));
        assertEquals(0, board.getColumnSize(4));
    }

}