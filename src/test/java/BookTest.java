import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
        Book testItem = new Book();

        @Test
        void shouldReturnAllItemsInStock() {
            assertEquals(30, testItem.getStock());
        }

        @Test
        void shouldReturnItemsInStockAfterSale() {
            testItem.sell(3);
            assertEquals(27, testItem.getStock());
            testItem.sell(4);
            assertEquals(23, testItem.getStock());
        }

        @Test
        void shouldRestock() {
            testItem.sell(3);
            assertEquals(27, testItem.getStock());
            testItem.restock();
            assertEquals(30, testItem.getStock());
        }
        @Test
        void shouldRestockAutomatically() {
            testItem.sell(10);
            testItem.autoRestockSelf();
            assertEquals(20, testItem.getStock());
            testItem.sell(16);
            testItem.autoRestockSelf();
            assertEquals(30, testItem.getStock());
        }
}
