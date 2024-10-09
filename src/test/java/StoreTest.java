import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
        Store store = new Store();
        Item chessBoard = new Item();

        Item book = new Item();

        @BeforeEach
        public void setup() {
            chessBoard.setItemName("chessBoard");
            chessBoard.setItemCapacity(12);
            chessBoard.setRestockLimit(4);
            store.addItemToStore(chessBoard);
            book.setItemName("book");
            book.setItemCapacity(30);
            book.setRestockLimit(10);
            store.addItemToStore(book);
        }
        @Test
        void shouldSellBooks() {
            store.sellItem(book, 10);
            assertEquals(20, book.getStock());
        }

        @Test
        void shouldSellChessBoards() {
            store.sellItem(chessBoard, 5);
            assertEquals(7, chessBoard.getStock());
        }

        @Test
        void shouldRestockAllItems() {
            store.sellItem(book, 10);
            store.sellItem(chessBoard,5);
            store.restockAllItems();
            assertEquals(30, book.getStock());
            assertEquals(12, chessBoard.getStock());
        }

        @Test
        void shouldAutoRestockAllItems() {
            store.sellItem(book, 10);
            store.sellItem(chessBoard,9);
            store.autoRestockAllItems();
            assertEquals(20, book.getStock());
            assertEquals(12, chessBoard.getStock());
        }
}








