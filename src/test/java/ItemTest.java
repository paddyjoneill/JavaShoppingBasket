import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    private Item item;

    @Before
    public void before(){
        item = new Item("Cheese", 2.50);
    }

    @Test
    public void itemHasName(){
        assertEquals("Cheese", item.getName());
    }

    @Test
    public void itemHasPrice(){
        assertEquals(2.50, item.getPrice(),0.01);
    }


}
