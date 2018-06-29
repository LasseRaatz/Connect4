/**
 * Responsible for keeping track of where in the tray the pegs are.
 */
public interface Gameboard {

    /**
     * Put a peg in the color of the given player into the given column.
     * @param playerNumber the player number of the owner of the peg.
     * @param column the column in which the peg is placed.
     */
    void putPeg(int playerNumber, int column);

    /**
     * Get the player number of the peg in the given position of the given column.
     * @param column the column number of the given column.
     * @param row the row of the peg in the column. 0 is bottom.
     * @return the player number of the owner of the peg.
     */
    int getOwnerOfPeg(int column, int row);

    /**
     * Returns the number of pegs in a given column.
     * @param column the column number of the given column.
     * @return the number of pegs in the given column.
     */
    int getColumnSize(int column);

    /**
     * @return the number of columns in the gameboard.
     */
    int getNumberOfColumns();

    /**
     * @return the number of rows in the gameboard.
     */
    int getNumberOfRows();
}
