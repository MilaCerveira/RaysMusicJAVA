import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;
    @Before
    public void setup(){
        piano = new Piano(25000.00);
    }
    @Test
    public void hasPrice(){
        assertEquals(25000.00, piano.getPrice(), 0.1);
    }
}
