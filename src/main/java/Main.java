public class Main {

    public static void main(String[] args) {
        GamestateController gsc = new GamestateControllerImpl();
        Gameboard gb = new GameboardImpl(8,8);
        View v = new ViewASCII();
        GameplayController gpc = new GameplayControllerImpl(gsc, gb, v);
        gpc.run();
    }
}
