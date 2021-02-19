public class Franc extends Money {
    private String currency;
    Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    String currency() {
        return currency;
    }
}
