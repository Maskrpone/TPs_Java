public class Movie extends Show {
    private final int releaseYear;
    private final String director;
    private final boolean replay;

    public Movie() {
        super();
        this.replay = false;
        this.releaseYear = 0;
        this.director = "None";
    }

    public Movie(String name, int duration, int releaseYear, String director, boolean replay) {
        super(name, duration);
        this.releaseYear = releaseYear;
        this.director = director;
        this.replay = replay;
    }

    public void display() {
        System.out.println("-------------");
        System.out.println("Name of movie : " + this.getName());
        System.out.println("Duration of movie : " + this.getDuration());
        System.out.println("Release year : " + this.releaseYear);
        System.out.println("The director is : " + this.director);
        System.out.println(this.replay ? "This is a replay" : "This is live");
    }
}
