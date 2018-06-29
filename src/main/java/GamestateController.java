/**
 * Responsible for checking if a move is a winning move.
 */
public interface GamestateController {

    /**
     * Returns true if the top peg in the given column is part of a connection of four.
     * @param column the given column number.
     * @return true if the move is a winning move.
     */
    boolean isWinningMove(int column);

    boolean isInHorizontalLine(int column);
    boolean isInVerticalLine(int column);
    boolean isInDownwardsDiagonalLine(int column);
    boolean isInUpwardsDiagonalLine(int column);
}
