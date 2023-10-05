public class Show {
    private final String name;
    private final int duration;
    public Show() {
        this.name = "None";
        this.duration = 0;
    }

    public final String getName() {
        return this.name;
    }

    public final int getDuration() {
        return this.duration;
    }

    public Show(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
}
