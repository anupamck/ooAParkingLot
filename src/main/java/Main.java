public class Main {
    public static void main(String[] args) {
        StoreSimulator simulator = new StoreSimulator();
        Store store = new Store();
        store.setStoreCapacity(30);
        simulator.setStore(store);
        simulator.simulateStore();
    }
}
