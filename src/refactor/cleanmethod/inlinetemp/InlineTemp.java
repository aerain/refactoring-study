package refactor.cleanmethod.inlinetemp;


class Order {
    int basePrice() { return 0; }
}
public class InlineTemp {

    private int _quantity;
    private int _itemPrice;


    boolean doSomething() {
        Order anOrder = new Order();

        double basePrice = anOrder.basePrice();
        return (basePrice > 1000);
    }

    double replaceTempWithQuery() {
        double basePrice = _quantity * _itemPrice;
        if (basePrice > 1000)
            return basePrice * 0.95;
        else
            return basePrice * 0.98;
    }

    double getPrice() {
        int basePrice = _quantity * _itemPrice;
        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;
        return basePrice * discountFactor;
    }
}
