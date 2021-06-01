package refactor.cleanmethod.extractmethod.example;

import java.util.Enumeration;
import java.util.Vector;

class Order {
    private int amount;

    public int getAmount() {
        return amount;
    }
}

public class ExtractMethodNoLocalVariable {

    private String _name;
    private Vector<Order> _orders;

    void printOwing() {
        Enumeration<Order> e = _orders.elements();
        double outstanding = 0.0;

        // 배너 출력
        System.out.println("--");
        System.out.println("고객 외상");
        System.out.println("--");

        // 외상액 계산
        while (e.hasMoreElements()) {
            Order each = e.nextElement();
            outstanding += each.getAmount();
        }

        // 세부 내역 출력
        System.out.println("고객명: " + _name);
        System.out.println("외상액: " + outstanding);
    }
}
