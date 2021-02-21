import org.junit.Before;
import org.junit.Test;
import shopItems.MusicSheet;
import shopItems.ShopItem;
import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    MusicSheet musicSheet;
    @Before
    public void setUp(){musicSheet = new MusicSheet(10.00, 20.00, "Mozart");}

    @Test
    public void hasBuyingPrice(){
        assertEquals(10.00, musicSheet.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(20.00, musicSheet.getSellingPrice(), 0.1);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(10.00, musicSheet.calculateMarkUp(), 0.1);
    }
}
