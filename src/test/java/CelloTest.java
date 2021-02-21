import instruments.Cello;

import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {
    Cello cello;

    @Before
    public void setUp() {
        cello = new Cello(250.00, "maple", 300.00, 4);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(250.00, cello.getBuyingPrice(), 0.01);

    }

    @Test
    public void hasSellingPrice() {
        assertEquals(300.00, cello.getSellingPrice(), 0.01);


        }

        @Test
        public void canPlay () {
            assertEquals("Yeet Yeet", cello.play());
        }

    }
