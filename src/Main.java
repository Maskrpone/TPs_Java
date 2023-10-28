public class Main {
    public static void main(String[] args) {
        Collection user1 = new Collection(1000);
        Collection user2 = new Collection(1000);
        Intermediate intermediate = new Intermediate();

        Content content1 = new Comics("Harry Potter", "J.K. Rowling", 10, 20, 300, false);
        Content content2 = new Comics("the Hobbit", "J.K. Rowling", 10, 20, 300, true);

        try {
            user1.addContent(content1);
            user2.addContent(content2);

            intermediate.exchange(user1, user2, content1, content2);
        } catch (CollectionsExceptions e) {
            System.out.println(e.getMessage());
        }


    }
}
