import java.util.ArrayList;

public class BasketDiscount implements IDiscountable {

    private double discountPercentage;
    private double basketLowerLimit;

    public BasketDiscount(double discountPercentage, double basketLowerLimit) {
        this.discountPercentage = discountPercentage;
        this.basketLowerLimit = basketLowerLimit;
    }

    public double applyDiscount(ArrayList<Item> items, double total) {
        if( total >= basketLowerLimit){
            return total * (discountPercentage/100);
        } else {
            return 0;
        }
    }


}
