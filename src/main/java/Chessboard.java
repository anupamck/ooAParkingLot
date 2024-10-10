public class Chessboard extends Item {
    public Chessboard() {
        setItemCapacity(12);
        setRestockLimit(4);
        setItemName("chessboard");
    }
    public String getItemName() {
        return itemName;
    }
}
