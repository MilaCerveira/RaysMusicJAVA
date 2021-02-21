import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp() {
        drums = new Drums(200.00, 250.00, "brass");
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(200.00, drums.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(250.00, drums.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Bootz catz bootz cats", drums.play());
    }
}
