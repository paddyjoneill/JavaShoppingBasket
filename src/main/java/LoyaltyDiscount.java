import java.util.ArrayList;

public class LoyaltyDiscount implements IDiscountable{

    String loyaltyCardNumber;
    double discountPercentage;

    public LoyaltyDiscount(String loyaltyCardNumber, double discountPercentage){
        this.loyaltyCardNumber = loyaltyCardNumber;
        this.discountPercentage = discountPercentage;
    }

    public double applyDiscount(ArrayList<Item> items, double total) {
        return total * (discountPercentage/100);
    }
}
