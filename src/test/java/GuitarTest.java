import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setup() {
        guitar = new Guitar(400.00, 500.00, "mahogany", 6);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(400.00, guitar.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(500.00, guitar.getSellingPrice(), 01);
    }

    @Test
    public void canPlay() {
        assertEquals("clang alang lang lang lang clang alang lang lang", guitar.play());
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getStrings());
    }
}
