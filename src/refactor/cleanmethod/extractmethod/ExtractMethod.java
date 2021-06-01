package refactor.cleanmethod.extractmethod;

public class ExtractMethod {

    private String _name;

    void printBanner() {
        System.out.println("print Banner");
    }

    void printOwing(double amount) {
        printBanner();

        // 세부 정보 출력
        System.out.println("name: " + _name);
        System.out.println("amount" + amount);
    }

}
