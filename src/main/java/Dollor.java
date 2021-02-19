public class Dollor extends Money {
    Dollor(int amount, String currency) {
        super(amount, currency);
    }

    Dollor times(int multiplier) {
        return Money.dollar(this.amount * multiplier);
    }
}
