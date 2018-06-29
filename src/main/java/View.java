/**
 * Responsible for showing the player the state of the game visually.
 */
public interface View {

    /**
     * Shows the player the current state of the game.
     * @param board the board that is shown.
     */
    void draw(Gameboard board);

    /**
     * Gets the next move.
     * @return the column that the next peg is thrown in.
     */
    int getNextMoveColumn();

}
