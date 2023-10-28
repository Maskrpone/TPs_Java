public interface Trading {
    void exchange(Collection user1, Collection user2, Content content1, Content content2) throws CollectionsExceptions;
    void sell(Collection seller, Collection buyer, String content) throws CollectionsExceptions;

}
