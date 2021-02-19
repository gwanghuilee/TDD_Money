public class Dollor extends Money {
    private String currency;
    Dollor(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    Dollor times(int multiplier) {
        return new Dollor(this.amount * multiplier);
    }

    String currency() {
        return currency;
    }
}
