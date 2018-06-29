public class GameplayControllerImpl implements GameplayController {

    GamestateController gsc;
    Gameboard gb;
    View v;

    public GameplayControllerImpl(GamestateController gsc, Gameboard gb, View v) {
        this.gsc = gsc;
        this.gb = gb;
        this.v = v;
    }

    @Override
    public void run() {
        boolean gameover = false;
        int activePlayer = 1;
        v.draw(gb);
        while(!gameover) {
            int nextMoveColumn = 0;
            boolean validMove = false;
            while(!validMove) {
                try {
                    nextMoveColumn = v.getNextMoveColumn();
                    if (nextMoveColumn < 0 || nextMoveColumn > gb.getNumberOfColumns()-1) throw new IllegalArgumentException();
                    validMove = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Illegal input. Try again.");
                }
            }
            gb.putPeg(activePlayer, nextMoveColumn);
            v.draw(gb);
            if (gsc.isWinningMove(nextMoveColumn, gb)) gameover = true;
            else {
                activePlayer = activePlayer%2+1;
                System.out.println("It is now player "+activePlayer+"'s turn!");
            }
        }
        System.out.println("Congrats player "+activePlayer+"! YOU WIN!");
    }
}
