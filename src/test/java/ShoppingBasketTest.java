import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    private ShoppingBasket shoppingBasket;
    private Item item;
    private Item wine;
    private IDiscountable discount;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
        item = new Item("Cheese", 2.50);
        wine = new Item("Red Wine", 25.00);
        discount = new BasketDiscount(10.00,20.00);
    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(0, shoppingBasket.getItemCount());
    }

    @Test
    public void canAddItemToShoppingBasket(){
        shoppingBasket.addItem(item);
        assertEquals(1, shoppingBasket.getItemCount());
    }

    @Test
    public void canRemoveItemFromShoppingBasket(){
        shoppingBasket.addItem(item);
        shoppingBasket.addItem(item);
        shoppingBasket.removeItem(item);
        assertEquals(1, shoppingBasket.getItemCount());
    }

    @Test
    public void canEmptyBasket(){
        shoppingBasket.addItem(item);
        shoppingBasket.empty();
        assertEquals(0, shoppingBasket.getItemCount());
    }

    @Test
    public void canGetBasketTotalValueBeforeDiscount(){
        shoppingBasket.addItem(item);
        shoppingBasket.addItem(item);
        assertEquals(5.00, shoppingBasket.getTotalValueBeforeDiscount(),0.01);

    }

    @Test
    public void canApplyTenPercentDiscountOnBasketOverTwenty(){
        shoppingBasket.addItem(wine);
        shoppingBasket.addDiscount(discount);
        assertEquals(22.50, shoppingBasket.getFinalTotal(),0.01);
    }

    @Test
    public void discountsStartsEmpty(){
        assertEquals(0, shoppingBasket.getDiscountCount());
    }

    @Test
    public void canAddDiscount(){
        IDiscountable discount = new BasketDiscount(10,20);
        shoppingBasket.addDiscount(discount);
        assertEquals(1, shoppingBasket.getDiscountCount());
    }


}
