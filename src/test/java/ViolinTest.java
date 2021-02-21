import instruments.InstrumentType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    Violin violin;

    @Before
    public void setUp() {
        violin = new Violin(45000.00, 50000.00, "amber", 4, 4);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(45000.00, violin.getBuyingPrice(), 0.1);
    }
    @Test
    public void hasSellingPrice(){assertEquals(50000.00, violin.getSellingPrice(), 0.1);}
    @Test
    public void canPlay() {
        assertEquals("Screech screech", violin.play());
    }

}
