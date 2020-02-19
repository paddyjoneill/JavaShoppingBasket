import java.util.ArrayList;

public class BasketDiscount implements IDiscountable {

    double discountPercentage;
    double basketLowerLimit;

    public BasketDiscount(double discountPercentage, double basketLowerLimit) {

    }

    public double applyDiscount(ArrayList<Item> items, double total) {
//        double total = this.getTotalValueBeforeDiscount();
//        if( total >= 20.00){
//            total = total * 0.9;
//        }
//
//        return total;
//    }
        return 0.0;
    }
}
