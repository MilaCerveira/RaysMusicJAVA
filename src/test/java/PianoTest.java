import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void setup() {
        piano = new Piano(25000.00, 30000.00, "beech", 52);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(25000.00, piano.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(30000.00, piano.getSellingPrice(), 0.1);
    }

    @Test
    public void canPlay() {
        assertEquals("dun dun dun", piano.play());
    }

    @Test
    public void hasKeys() {
        assertEquals(52, piano.getKeys());
    }
}

