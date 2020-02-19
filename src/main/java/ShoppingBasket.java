import java.util.ArrayList;

public class ShoppingBasket {

    ArrayList<Item> items;
    ArrayList<IDiscountable> discounts;

    public ShoppingBasket(){
        items = new ArrayList<Item>();
        discounts = new ArrayList<IDiscountable>();
    }

    public int getItemCount(){
        return this.items.size();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void empty() {
        this.items.clear();
    }

    public void addDiscount(IDiscountable discount){
        this.discounts.add(discount);
    }

    public double getTotalValueBeforeDiscount() {
        double runningTotal = 0;
        for(Item item : items){
            runningTotal += item.getPrice();
        }
        return runningTotal;
    }

    public double getFinalTotal(){
        double total = this.getTotalValueBeforeDiscount();
        for (IDiscountable discount : discounts){
            double discountAmount = discount.applyDiscount(items, total);
            total -= discountAmount;
        }
        return total;
    }

    public int getDiscountCount() {
       return this.discounts.size();
    }
}
