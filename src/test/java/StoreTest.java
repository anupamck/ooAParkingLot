import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    Store store = new Store();

    @BeforeEach
    public void setup() {
        store.setStoreCapacity(10);
    }

    @Test
    void shouldReturnAllItemsInStock() {
        assertEquals(10, store.getStock());
    }

    @Test
    void shouldReturnItemsInStockAfterSale() {
        store.sellItems(3);
        assertEquals(7, store.getStock());
        store.sellItems(4);
        assertEquals(3, store.getStock());
    }

    @Test
    void shouldRestock() {
        store.sellItems(3);
        assertEquals(7, store.getStock());
        store.restock();
        assertEquals(10, store.getStock());
    }
}








