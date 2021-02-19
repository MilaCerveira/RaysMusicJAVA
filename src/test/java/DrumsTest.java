import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp() {
        drums = new Drums(200.00);
    }

    @Test
    public void hasPrice() {
        assertEquals(200.00, drums.getPrice(), 0.01);
    }
}