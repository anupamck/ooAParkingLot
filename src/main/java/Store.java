public class Store {
    private int capacity = 10;
    private int itemsPurchased;

    private Customer customer;

    public int getAvailableSlots() {
        return (capacity - itemsPurchased);
    }
    void displayAvailableSlots() {
        System.out.println(getAvailableSlots() + " slots are available");
    }
}
