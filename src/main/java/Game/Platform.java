package Game;

public enum Platform {
    PC("Windows"), MAC("MacOS"), ANDROID("Android");

    private String name;

    Platform(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
