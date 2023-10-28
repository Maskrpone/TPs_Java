public abstract class Book extends Content{
    private final int ISBN;
    private final int nbPages;

    public Book(String title, String author, int ISBN, int price, int nbPages) {
        super(title, author, price);
        this.ISBN = ISBN;
        this.nbPages = nbPages;
    }

    //region Getters

    public int getISBN() {
        return ISBN;
    }
    public int getNbPages() {
        return nbPages;
    }

    //endregion

    public abstract void display();
}
