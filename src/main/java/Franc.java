public class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Franc times(int multiplier) {
        return Money.franc(this.amount * multiplier);
    }
}
