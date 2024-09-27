import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    private Customer customer = new Customer();

    @Test
    void shouldReturnDefaultPurchaseQuantity() {
        assertEquals(1, customer.getPurchaseQuantity());
    }

    @Test
    void shouldReturnSetPurchaseQuantity() {
        customer.setPurchaseQuantity(5);
        assertEquals(5, customer.getPurchaseQuantity());
    }

}
