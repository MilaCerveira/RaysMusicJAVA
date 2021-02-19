import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    Violin violin;

    @Before
    public void setUp() {
        violin = new Violin(45000.00);
    }

    @Test
    public void hasPrice() {
        assertEquals(45000.00, violin.getPrice(), 0.1);
    }

}
