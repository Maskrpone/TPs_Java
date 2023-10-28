// Author : Hippolyte DEPARIS
// This class plays the role of intermediate between two collections. Transactions go through this class.
// USER1 ==> Intermediate ==> USER2
public class Intermediate implements Trading {
    public void sell(Collection seller, Collection buyer, String content) throws CollectionsExceptions {
        if (!seller.getContents().containsKey(content)) throw new CollectionsExceptions("The seller does not possess this book");
        if (buyer.getContents().containsKey(content)) throw new CollectionsExceptions("The buyer already possesses this book");
        if (seller.getContent(content).getPrice() > buyer.getCredits()) throw new CollectionsExceptions("The buyer does not have enough credit to buy this book");

        buyer.modifyBudget(-seller.getContent(content).getPrice());
        seller.modifyBudget(seller.getContent(content).getPrice());

        seller.removeBook(content);
        buyer.addContent(seller.getContent(content));
    }

    @Override
    public void exchange(Collection user1, Collection user2, Content content1, Content content2) throws CollectionsExceptions {
        if (!user1.getContents().containsKey(content1.getTitle())) throw new CollectionsExceptions("The first user does not possess this book");
        if (!user2.getContents().containsKey(content2.getTitle())) throw new CollectionsExceptions("The second user does not possess this book");
        if (user1.getContent(content1.getTitle()).getPrice() != user2.getContent(content2.getTitle()).getPrice()) throw new CollectionsExceptions("The two books do not have the same price");

        user1.removeBook(content1.getTitle());
        user2.removeBook(content2.getTitle());

        user1.addContent(content2);
        user2.addContent(content1);
    }
}
