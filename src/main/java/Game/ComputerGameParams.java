package Game;
import java.util.ArrayList;

public class ComputerGameParams {

    private String name;
    private String description;
    private ArrayList<Genre> genres;
    private ArrayList<Platform> platforms;
    private int price;
    private int ageRestriction;

    public ComputerGameParams(String name, String description, int price,
                              int ageRestriction, ArrayList<Genre> genres,
                              ArrayList<Platform> platforms) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.ageRestriction = ageRestriction;
        this.genres = genres;
        this.platforms = platforms;
    }

    public boolean filter(ComputerGameParams otherParams) {
        if (!(name.equals(otherParams.getName()))
                || (price != otherParams.getPrice())
                || (ageRestriction != otherParams.getAgeRestriction())
                || (!(genres.containsAll(otherParams.getGenres()))
                && otherParams.getGenres().containsAll(genres))
                || (!(platforms.containsAll(otherParams.getPlatforms())
                && otherParams.getPlatforms().containsAll(platforms)))) {
            return false;
        }
        return true;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public ArrayList<Platform> getPlatforms() {
        return platforms;
    }

    public int getPrice() {
        return price;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

}
