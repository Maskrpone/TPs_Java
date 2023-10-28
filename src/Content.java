public abstract class Content {
    String title;
    String author;
    int price;
    public Content(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public abstract void display();

    public void conciseDisplay() {
        System.out.print("Title: " + title);
        System.out.print(" | Author: " + author);
        System.out.println(" | Price: " + price);
    }

}
