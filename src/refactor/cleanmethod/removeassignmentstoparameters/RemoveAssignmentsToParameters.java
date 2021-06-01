package refactor.cleanmethod.removeassignmentstoparameters;

public class RemoveAssignmentsToParameters {
    int discount (int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50) inputVal -= 2;

        return inputVal;
    }
}
