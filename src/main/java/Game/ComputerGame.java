package Game;

public class ComputerGame {
    private static int gameIdCounter;
    private final int gameId;
    private final ComputerGameParams gameParams;

    public ComputerGame(ComputerGameParams gameParams) {
        this.gameId = ComputerGame.gameIdCounter++;
        this.gameParams = gameParams;
    }

    public int getGameId() {
        return gameId;
    }

    public ComputerGameParams getGameParams() {
        return gameParams;
    }
}

