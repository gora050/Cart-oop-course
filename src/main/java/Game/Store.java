package Game;
import java.util.ArrayList;

public class Store {
    private final ArrayList<ComputerGame> games = new ArrayList<ComputerGame>();

    public void addGame(ComputerGame computerGame) {
        games.add(computerGame);
    }

    public ArrayList<ComputerGame> search(ComputerGameParams searchParams) {
        ArrayList<ComputerGame> matching = new ArrayList<ComputerGame>();
        for (ComputerGame computerGame: games) {
            if (computerGame.getGameParams().filter(searchParams)) {
                matching.add(computerGame);
            }
        }
        return matching;
    }

    public ArrayList<ComputerGame> getComputerGames() {
        return games;
    }
}
