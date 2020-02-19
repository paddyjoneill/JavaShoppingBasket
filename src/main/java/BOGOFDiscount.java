import java.util.ArrayList;

public class BOGOFDiscount implements IDiscountable{

    private Item discountedItem;

    public BOGOFDiscount(Item item){
        this.discountedItem = item;
    }

    public int howManyBogofItemInBasket(ArrayList<Item> items){
        int itemCount = 0;
        for(Item item: items){
            if(item == discountedItem){
                itemCount += 1;
            }
        }
        return itemCount;
    }

    public double applyDiscount(ArrayList<Item> items, double total) {
        int itemCount = this.howManyBogofItemInBasket(items);
        int freeItems = itemCount / 2;
        return this.discountedItem.getPrice() * freeItems;
    }
}
