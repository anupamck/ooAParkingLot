import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChessboardTest {
        Chessboard testItem = new Chessboard();

        @Test
        void shouldReturnAllItemsInStock() {
            assertEquals(12, testItem.getStock());
        }

        @Test
        void shouldReturnItemsInStockAfterSale() {
            testItem.sell(3);
            assertEquals(9, testItem.getStock());
            testItem.sell(4);
            assertEquals(5, testItem.getStock());
        }

        @Test
        void shouldRestock() {
            testItem.sell(3);
            assertEquals(9, testItem.getStock());
            testItem.restock();
            assertEquals(12, testItem.getStock());
        }
        @Test
        void shouldRestockAutomatically() {
            testItem.sell(3);
            testItem.autoRestockSelf();
            assertEquals(9, testItem.getStock());
            testItem.sell(6);
            testItem.autoRestockSelf();
            assertEquals(12, testItem.getStock());
        }
}
