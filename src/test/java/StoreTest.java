import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StoreTest {
        Store store = new Store();
        Chessboard chessBoard = new Chessboard();
        Book book = new Book();

        @BeforeEach
        public void setup() {
            store.addItemToStore(chessBoard);
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








