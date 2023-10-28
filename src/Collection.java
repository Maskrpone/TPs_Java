import java.util.HashMap;

public class Collection {
    private int credits;
    private final HashMap<String, Content> contents;

    public Collection(int budget) {
        this.credits = budget;
        this.contents = new HashMap<>();
    }

    public int getCredits() {
        return this.credits;
    }

    public HashMap<String, Content> getContents() {
        return this.contents;
    }

    public Content getContent(String name) throws CollectionsExceptions {
        if (!this.contents.containsKey(name)) throw new CollectionsExceptions("The book is not in the collection");

        return this.contents.get(name);
    }
    public void addContent(Content content) throws CollectionsExceptions {
        if (this.contents.containsKey(content.getTitle()))
            throw new CollectionsExceptions("The book is already in the collection");

        this.contents.put(content.getTitle(), content);
    }

    public void removeBook(String name) throws CollectionsExceptions {
        if (!this.contents.containsKey(name)) throw new CollectionsExceptions("The book is not in the collection");

        this.contents.remove(name);
    }

    public void modifyBudget(int credit) {
        this.credits += credit;
    }
}