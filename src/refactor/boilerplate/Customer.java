package refactor.boilerplate;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<>();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    @SuppressWarnings("unused")
    public String statement() {
        Enumeration<Rental> rentals = _rentals.elements();

        String result = getName() + " 고객님의 대여 기록\n";
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            // 이번에 대여하는 비디오 정보와 대여료를 출력.
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    each._movie.getCharge(each.getDaysRented()) + "\n";

        }
        // 푸터 행 추가
        result += "누적 대여료: " + getTotalCharge() + "\n";
        result += "적립 포인트: " + getFrequentRenterPoints();
        return result;
    }

    private int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    private double getTotalCharge() {
        double totalAmount = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            totalAmount = each._movie.getCharge(each.getDaysRented());
        }
        return totalAmount;
    }

}
