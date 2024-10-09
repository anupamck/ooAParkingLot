import java.util.ArrayList;

public class Store {
    private ArrayList<Item> items = new ArrayList<>();

    void addItemToStore(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    void sellItem(Item item, int numberOfItemsSold) {
        item.sell(numberOfItemsSold);
    }

    void restockAllItems() {
        for(Item item: items) {
            item.restock();
        }
    }

    void autoRestockAllItems() {
        for(Item item: items) {
            item.autoRestockSelf();
        }
    }
}
