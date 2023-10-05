public class Show {
    private final String name;
    private final int duration;

    public Show(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public final String getName() {
        return this.name;
    }

    public final int getDuration() {
        return this.duration;
    }
}
