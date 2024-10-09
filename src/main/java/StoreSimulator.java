import java.util.*;
import java.io.*;

public class StoreSimulator {
    private final Random random = new Random();

    private boolean shouldSimulationContinue(Scanner scanner) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Press Enter key to continue, any other key to abort: ");
            try {
                String input = reader.readLine();
                return input.isEmpty();  // True if user presses Enter, false otherwise
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;  // Return false in case of any input/output error
        }

    private void declareInventory(Store store) {
        for (Item item : store.getItems()) {
            System.out.println("The store has " + item.getStock() + " " + item.getItemName() + "s stocked");
        }
    }

    public void simulateStore() {
        System.out.println("Welcome to the store simulator");
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        Item chessboard = new Item();
        chessboard.setItemName("chessboard");
        chessboard.setItemCapacity(10);
        chessboard.setRestockLimit(4);
        Item book = new Item();
        book.setItemName("book");
        book.setItemCapacity(30);
        book.setRestockLimit(10);
        store.addItemToStore(chessboard);
        store.addItemToStore(book);
        while(true) {
            declareInventory(store);
            // Sell chessboard
            int chessBoardPurchaseQuantity = random.nextInt(1,5);
            System.out.println("The store sells " + chessBoardPurchaseQuantity + " chessboard(s)");
            store.sellItem(chessboard, chessBoardPurchaseQuantity);
            // Sell books
            int bookPurchaseQuantity = random.nextInt(1, 10);
            System.out.println("The store sells " + bookPurchaseQuantity + " book(s)");
            store.sellItem(book, bookPurchaseQuantity);
            store.autoRestockAllItems();
            declareInventory(store);
            if(!shouldSimulationContinue(scanner)){
                System.out.println("Aborting simulation");
                break;
            }
        }
    }

}
