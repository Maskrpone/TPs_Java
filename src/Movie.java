public class Movie extends Content{
    double duration;
    public Movie(String title, String author, int price, double duration) {
        super(title, author, price);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration);
    }
}
