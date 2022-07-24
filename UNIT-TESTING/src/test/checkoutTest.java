
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.Main;

public class checkoutTest {
    @Test

    public void subtotalIsValid() {
        assertEquals(19.2, Main.getSubtotal());
    }
}