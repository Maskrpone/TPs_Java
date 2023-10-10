// Author: Hippolyte DEPARIS
public class Movie extends Emission {
    private final int yearOfRelease;
    private final String director;
    private boolean isLive;

    public Movie(String name, int yearOfRelease, String director, boolean isLive, int duration) {
        super(name, duration);
        this.yearOfRelease = yearOfRelease;
        this.director = director;
        this.isLive = isLive;
    }

    // getters
    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public String getDirector() {
        return this.director;
    }

    public boolean getIsLive() {
        return this.isLive;
    }

    // setter, because a movie can be live the first day of its release and then not live anymore
    public void setIsLive(boolean isLive) {
        this.isLive = isLive;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.getName());
        System.out.println("Year of release: " + this.getYearOfRelease());
        System.out.println("Director: " + this.getDirector());
        System.out.println("Is live: " + this.getIsLive());
        System.out.println("Duration: " + this.getDuration() + " minutes");
    }
}
