public class UnmodifiableGameboard implements Gameboard {
    private final Gameboard gameboard;

    UnmodifiableGameboard(Gameboard gameboard) {
        this.gameboard = gameboard;
    }

    @Override
    public void putPeg(int playerNumber, int column) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getOwnerOfPeg(int column, int row) {
        return gameboard.getOwnerOfPeg(column, row);
    }

    @Override
    public int getColumnSize(int column) {
        return gameboard.getColumnSize(column);
    }

    @Override
    public int getNumberOfColumns() {
        return gameboard.getNumberOfColumns();
    }

    @Override
    public int getNumberOfRows() {
        return gameboard.getNumberOfRows();
    }
}
