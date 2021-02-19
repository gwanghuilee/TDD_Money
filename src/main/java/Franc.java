public class Franc extends Money {
    private String currency;
    Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Franc times(int multiplier) {
        return Money.franc(this.amount * multiplier);
    }

    String currency() {
        return currency;
    }
}
