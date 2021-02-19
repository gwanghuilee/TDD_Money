public class Dollor extends Money {
    private String currency;
    Dollor(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Dollor times(int multiplier) {
        return Money.dollar(this.amount * multiplier);
    }

    String currency() {
        return currency;
    }
}
