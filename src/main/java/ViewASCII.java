public class ViewASCII implements View {

    @Override
    public void draw(Gameboard board) {
        printSeperator();
        for (int i = board.getNumberOfRows()-1; i >= 0; i--) {
            printRow(i, board);
            printFloor(board.getNumberOfColumns());
        }
        printFloor(board.getNumberOfColumns());
    }

    private void printSeperator() {
        System.out.println();
        System.out.println("#########################");
        System.out.println();
    }

    private void printRow(int rowNumber, Gameboard board) {
        System.out.print("|");
        for (int column = 0; column < board.getNumberOfColumns(); column++) {
            printOwner(column, rowNumber, board);
            System.out.println("|");
        }
    }

    private void printFloor(int numberOfColumns) {
        System.out.print("-");
        for (int i = 0; i < numberOfColumns; i++) {
            System.out.print("--");
        }
    }

    private void printOwner(int column, int row, Gameboard board) {
        try {
            int owner = board.getOwnerOfPeg(column, row);
            System.out.print(owner);
        } catch (IllegalArgumentException e) {
            System.out.print(" ");
        }
    }
}
