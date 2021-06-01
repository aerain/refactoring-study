package refactor.cleanmethod.inlinemethod;

public class InlineMethod {

    private int _numberOfLateDeliveries;

    int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }
}
