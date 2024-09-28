public class Store {
    private int storeCapacity = 100;
    private int itemsRemaining = storeCapacity;

    void setStoreCapacity(int capacity) {
        storeCapacity = capacity;
        itemsRemaining = storeCapacity;
    }
    int getStock() {
        return itemsRemaining;
    }
    
    void sellItems(int numberOfItemsSold) {
        itemsRemaining = getStock() - numberOfItemsSold;
    }

    void restock() {
        itemsRemaining = storeCapacity;
    }
}
