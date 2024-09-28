import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
        Item testItem = new Item();

        @BeforeEach
        public void setup() {
            testItem.setItemCapacity(20);
            testItem.setRestockLimit(10);
            testItem.setItemName("Chesboard");
        }

        @Test
        void shouldReturnAllItemsInStock() {
            assertEquals(20, testItem.getStock());
        }

        @Test
        void shouldReturnItemsInStockAfterSale() {
            testItem.sell(3);
            assertEquals(17, testItem.getStock());
            testItem.sell(4);
            assertEquals(13, testItem.getStock());
        }

        @Test
        void shouldRestock() {
            testItem.sell(3);
            assertEquals(17, testItem.getStock());
            testItem.restock();
            assertEquals(20, testItem.getStock());
        }
        @Test
        void shouldRestockAutomatically() {
            testItem.sell(3);
            testItem.autoRestockSelf();
            assertEquals(17, testItem.getStock());
            testItem.sell(10);
            testItem.autoRestockSelf();
            assertEquals(20, testItem.getStock());
        }
}
