import instruments.Cello;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {
    Cello cello;

    @Before
    public void setUp() {
        cello = new Cello(250.00);
    }

    @Test
    public void hasPrice() {
        assertEquals(250.00, cello.getPrice(), 0.01);

    }
    @Test
    public void canPlay(){
        assertEquals("Yeet Yeet", cello.play());
    }

}
