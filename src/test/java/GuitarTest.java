import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setup() {
        guitar = new Guitar(400.00);
    }

    @Test
    public void hasPrice() {
        assertEquals(400.00, guitar.getPrice(), 0.1);
    }
}
