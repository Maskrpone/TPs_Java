public class Main {
    public static void main(String[] args) {
        Movie ironman = new Movie("Iron-man 3", 2, 2013, "Kevin Felge", true);
        ironman.display();

        Entertainment kardashianshow = new Entertainment("Kardashian's show", "Kim Kardashian");
        kardashianshow.display();

        Report natgeo = new Report("National geographic", 2, "nature");
        natgeo.display();
    }
    //test
}