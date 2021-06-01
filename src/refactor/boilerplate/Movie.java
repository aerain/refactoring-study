package refactor.boilerplate;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private Price _price;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        setPriceCode(_priceCode);
    }

    public String getTitle() {
        return _title;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    double getCharge(int daysRented) {
        return 0.0;
    }

    int getFrequentRenterPoints(int daysRented) {
        // 최신물을 이틀 이상 대여하면 보너스 포인트 지급
        if ((getPriceCode() == NEW_RELEASE) &&
            daysRented > 1) return 2;
        return 1;
    }
}
