import java.util.*;
import java.io.*;

public class StoreSimulator {
    private Store store;
    private int restockLimit = 10;

    void setStore(Store store) {
        this.store = store;
    }

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
    public void autoRestockStore() {
        if(store.getStock() < restockLimit) {
            store.restock();
            System.out.println("The store has now been restocked");
        }
    }
    public void simulateStore() {
        System.out.println("Welcome to the store simulator");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("The store has " + store.getStock() + " items stocked");
            Random random = new Random();
            int purchaseQuantity = random.nextInt(1,11);
            System.out.println("The store sells " + purchaseQuantity + " items");
            store.sellItems(purchaseQuantity);
            System.out.println("The store now has " + store.getStock() + " item(s) stocked");
            autoRestockStore();
            if(!shouldSimulationContinue(scanner)){
                System.out.println("Aborting simulation");
                break;
            }
        }
    }

}
