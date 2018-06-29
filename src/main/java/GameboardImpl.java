public class GameboardImpl implements Gameboard {

    private int[][] board;
    private final int NUMBER_OF_ROWS;
    private final int NUMBER_OF_COLUMNS;

    public GameboardImpl(int numberOfColumns, int numberOfRows) {
        NUMBER_OF_COLUMNS = numberOfColumns;
        NUMBER_OF_ROWS = numberOfRows;
        board = new int[NUMBER_OF_COLUMNS][NUMBER_OF_ROWS];
    }

    @Override
    public void putPeg(int playerNumber, int column) {
        int row = getColumnSize(column);
        setPeg(column, row, playerNumber);
    }

    @Override
    public int getOwnerOfPeg(int column, int row) throws IllegalArgumentException {
        int owner = board[column][row];
        if (owner == 0) throw new IllegalArgumentException("No peg at the given position");
        return owner;
    }

    @Override
    public int getColumnSize(int column) {
        int row = 0;
        while(!positionIsEmpty(column, row++));
        return row;
    }

    @Override
    public int getNumberOfColumns() {
        return NUMBER_OF_COLUMNS;
    }

    @Override
    public int getNumberOfRows() {
        return NUMBER_OF_ROWS;
    }

    private void setPeg(int column, int row, int playerNumber) {
        board[column][row] = playerNumber;
    }

    private boolean positionIsEmpty(int column, int row) {
        try {
            getOwnerOfPeg(column, row);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }
}
