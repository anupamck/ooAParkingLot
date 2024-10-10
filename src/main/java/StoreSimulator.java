import java.util.*;
import java.io.*;

public class StoreSimulator {
    private final Random random = new Random();

    private boolean shouldSimulationContinue() {
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
        Store store = new Store();
        Chessboard chessboard = new Chessboard();
        Book book = new Book();
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
            if(!shouldSimulationContinue()){
                System.out.println("Aborting simulation");
                break;
            }
        }
    }

}
