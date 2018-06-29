import javafx.geometry.Pos;

public class GamestateControllerImpl implements GamestateController {

    @Override
    public boolean isWinningMove(int column, Gameboard board) {
        Position pos = new Position(column, board.getColumnSize(column)-1);
        return
                (isHorisontalConnection(pos, board) ||
                 isVerticalConnection(pos, board)   ||
                 isDiagonalConnection(pos, board));
    }

    private boolean isHorisontalConnection(Position pos, Gameboard board) {
        return (numberOfOwnedPegsToTheLeft(pos, board) + numberOfOwnedPegsToTheRight(pos, board) == 3);
    }

    private boolean isVerticalConnection(Position pos, Gameboard board) {
        return (numberOfOwnedPegsBelow(pos, board) == 3);
    }

    private boolean isDiagonalConnection(Position pos, Gameboard board) {
        return
        ((numberOfOwnedPegsInBottomLeftDiagonal(pos, board) + numberOfOwnedPegsInTopRightDiagonal(pos, board) == 3) ||
        (numberOfOwnedPegsInBottomRightDiagonal(pos, board) + numberOfOwnedPegsInTopLeftDiagonal(pos, board) == 3));
    }

    private int getOwner(Position pos, Gameboard board) throws IllegalArgumentException {
        return board.getOwnerOfPeg(pos.column, pos.row);
    }

    private int numberOfOwnedPegsToTheLeft(Position pos, Gameboard board) {
        return numberOfPegsInGivenDirection(pos, board, Direction.Left);
    }

    private int numberOfOwnedPegsToTheRight(Position pos, Gameboard board) {
        return numberOfPegsInGivenDirection(pos, board, Direction.Right);
    }

    private int numberOfOwnedPegsBelow(Position pos, Gameboard board) {
        return numberOfPegsInGivenDirection(pos, board, Direction.Down);
    }

    private int numberOfOwnedPegsInBottomLeftDiagonal(Position pos, Gameboard board) {
        return numberOfPegsInGivenDirection(pos, board, Direction.BottomLeft);
    }

    private int numberOfOwnedPegsInTopRightDiagonal(Position pos, Gameboard board) {
        return numberOfPegsInGivenDirection(pos, board, Direction.TopRight);
    }

    private int numberOfOwnedPegsInBottomRightDiagonal(Position pos, Gameboard board) {
        return numberOfPegsInGivenDirection(pos, board, Direction.BottomRight);
    }

    private int numberOfOwnedPegsInTopLeftDiagonal(Position pos, Gameboard board) {
        return numberOfPegsInGivenDirection(pos, board, Direction.TopLeft);
    }

    private int numberOfPegsInGivenDirection(Position pos, Gameboard board, Direction direction) {
        int result = 0;
        Position left = pos.getNext(direction);
        try {
            while(getOwner(pos, board) == getOwner(left, board)) {
                result++;
                pos = left;
                left = pos.getNext(direction);
            }
        } catch (IllegalArgumentException e) {}
        return result;
    }

    private class Position {
        int column, row;

        public Position(int column, int row) {
            this.column = column;
            this.row = row;
        }

        public Position getLeft() {
            return new Position(column-1, row);
        }

        public Position getRight() {
            return new Position(column+1, row);
        }

        public Position getDown() {
            return new Position(column, row-1);
        }

        public Position getTopLeft() {
            return new Position(column-1, row+1);
        }

        public Position getTopRight() {
            return new Position(column+1, row+1);
        }

        public Position getBottomLeft() {
            return new Position(column-1, row-1);
        }

        public Position getBottomRight() {
            return new Position(column+1, row-1);
        }

        public Position getNext(Direction dir) {
            switch (dir) {
                case Left:
                    return getLeft();
                case Right:
                    return getRight();
                case Down:
                    return getDown();
                case TopLeft:
                    return getTopLeft();
                case TopRight:
                    return getTopRight();
                case BottomLeft:
                    return getBottomLeft();
                case BottomRight:
                    return getBottomRight();
                default:
                    throw new IllegalArgumentException("Direction not found");
            }
        }
    }

    public enum Direction { Left, Right, TopLeft, TopRight, BottomLeft, BottomRight, Down; }
}
