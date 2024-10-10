public class Book extends Item {
    public Book() {
        setItemCapacity(30);
        setRestockLimit(10);
        setItemName("book");
    }
    public String getItemName() {
        return itemName;
    }
}
