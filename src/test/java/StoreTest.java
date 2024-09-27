import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    private Store store = new Store();

    @Test
    void shouldReturnAllAvailableItems() {
        assertEquals(10, store.getAvailableSlots());
    }

    @Test
    void shouldReturnRemainingItems() {

    }








}
