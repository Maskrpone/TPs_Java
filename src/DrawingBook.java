import java.util.HashMap;

public class DrawingBook extends Book{
    private final HashMap<Integer, Boolean> pages;
    public DrawingBook(String name, String author, int ISBN, int price, int nbPages) {
        super(name, author, ISBN, price, nbPages);
        this.pages = new HashMap<>();
        for (int i = 0; i < nbPages; i++) {
            this.pages.put(i, false);
        }
    }

    public void colorise(int index) throws CollectionsExceptions {
        if (index > this.getNbPages()) throw new CollectionsExceptions("This pages is not in the book.");
        if (this.pages.get(index)) throw new CollectionsExceptions("This page is already colorized.");

        this.pages.replace(index, true);
    }

    @Override
    public void display() {
        System.out.println("Name: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Price: " + getPrice());
        System.out.println("Number of pages: " + getNbPages());
    }
}
