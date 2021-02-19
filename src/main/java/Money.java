public class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        Money money = (Money) object;
        return amount == money.amount &&
                currency().equals(money.currency());
    }

    public String toString() {
        return amount + "   " + currency;
    }
}
