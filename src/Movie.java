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
    public void setIsLive(boolean isLive) {
        this.isLive = isLive;
    }
    @Override
    public void print() {
        System.out.println("Name: " + this.getName());
        System.out.println("Year of release: " + this.yearOfRelease);
        System.out.println("Director: " + this.director);
        System.out.println("Is live: " + this.isLive);
        System.out.println("Duration: " + this.getDuration() + " minutes");
    }
    @Override
    public boolean isValid() {
        if(!this.isLive) {
            return true;
        } else return this.getStart() == 21;
    }
}
