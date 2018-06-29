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
        while(!gameover) {
            int nextMoveColumn;
            v.getNextMoveColumn();
        }
    }
}
