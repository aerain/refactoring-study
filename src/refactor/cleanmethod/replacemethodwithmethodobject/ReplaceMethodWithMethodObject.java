package refactor.cleanmethod.replacemethodwithmethodobject;

class Order {
    double price() {
        double primaryBasePrice;
        double secondaryBasePrice;
        double tertiaryBasePrice;

        // long calculate code;

        return 0.0;
    }
}

class Account {
    int gamma (int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100)
            importantValue2 -= 20;
        int importantValue3 = importantValue2 * 7;

        //etc
        return importantValue3 - 2 * importantValue1;
    }

    int delta() {
        return 0;
    }
}