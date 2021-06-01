package refactor.cleanmethod.introduceexplainingvariable;

public class IntroduceExplainingVariable {

    void doSomeThing(String platform, String browser, int resize) {
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
        wasInitialized() && resize > 0) {
            // do business logic
        }

    }

    boolean wasInitialized() {
        return true;
    }

}

class Item {
    private int _quantity;
    private int _itemPrice;

    double price() {
        // 결제액 (price) = 총 구매액(base price) -
        // 대량 구매 할인(quantity discount) + 배송비(shipping)
        return _quantity * _itemPrice -
                Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
                Math.min(_quantity * _itemPrice * 0.1, 100.0);
    }
}
