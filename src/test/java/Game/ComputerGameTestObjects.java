package Game;

import java.util.ArrayList;

public class ComputerGameTestObjects {
    public static ComputerGameParams GameParams1() {
        return new ComputerGameParams(
                "Goat Simulator",
                "simulator goat alalla",
                9500,
                21,
                new ArrayList<Genre>() {{add(Genre.ACTION);}},
                new ArrayList<Platform>() {{add(Platform.PC); add(Platform.ANDROID);}}
        );
    }

    public static ComputerGameParams GameParams2() {
        return new ComputerGameParams(
                "PUBG",
                "Our BATTLE ROYALE Game-mode will put up to 100 players on a remote island \n" +
                        "for a winner-takes-allshowdown where strategic gameplay is as important as shooting skills. \n" +
                        "Players will enter a last-man-standing battle where they try to locate weapons, vehicles and supplies in a graphically and tactically rich battleground \n" +
                        "that eventually forces players into a shrinking play zone as they engage in a tense and spectacular fight to the death.",
                1795,
                18,
                new ArrayList<Genre>() {{add(Genre.MOBA); add(Genre.ACTION);}},
                new ArrayList<Platform>() {{add(Platform.PC);}}
        );
    }
    public static ComputerGameParams GameParams3() {
        return new ComputerGameParams(
                "DOTA2",
                "Just dotka for schkolota",
                0,
                0,
                new ArrayList<Genre>() {{add(Genre.MOBA);}},
                new ArrayList<Platform>() {{add(Platform.MAC); add(Platform.PC); }}
        );
    }
}
