package Game;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {
    private static Store store = new Store();


    @Test
    public void TestAddGame1() throws Exception {
        ComputerGame Game = new ComputerGame(ComputerGameTestObjects.GameParams1());
        store.addGame(Game);
        assertEquals(store.getComputerGames().get(0), Game);
    }

    @Test
    public void TestAddGame2() throws Exception {
        ComputerGame Game = new ComputerGame(ComputerGameTestObjects.GameParams3());
        store.addGame(Game);
        assertEquals(store.getComputerGames().get(1), Game);
    }

    public boolean TestSearchHelper(ComputerGameParams params) {
        for (ComputerGame Game : store.search(params)) {
            if (Game.getGameParams().filter(params)) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void TestSearch1() throws Exception {
        assertEquals(TestSearchHelper(ComputerGameTestObjects.GameParams2()), false);
    }
}