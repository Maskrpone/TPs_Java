import java.util.ArrayList;

public class Comics extends Book {
    private final boolean isColored;
    private final ArrayList<Integer> colorizedPages;

    public Comics(String name, String author, int ISBN, int price, int nbPages, boolean isColored) {
        super(name, author, ISBN, price, nbPages);
        this.isColored = isColored;

        this.colorizedPages = new ArrayList<>();
        if (isColored) {
            for (int i = 0; i < nbPages; i++) {
                colorizedPages.add(i);
            }
        }
    }

    public void colorise(int index) throws CollectionsExceptions {
        if (index > this.getNbPages()) throw new CollectionsExceptions("This page is not in the book.");
        if (isColored) throw new CollectionsExceptions("This comic is already colored.");
        if (colorizedPages.contains(index)) throw new CollectionsExceptions("This page is already colorized.");

        this.colorizedPages.add(index);
    }

    @Override
    public void display() {
        System.out.println("Name: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Price: " + getPrice());
        System.out.println("Number of pages: " + getNbPages());
        System.out.println("Is colored: " + isColored);
    }
}
