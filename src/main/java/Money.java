public abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollor dollar(int amount) {
        return new Dollor(amount, "USD");
    }

    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    abstract Money times(int multiplier);

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        Money money = (Money) object;
        return amount == money.amount &&
                getClass().equals(money.getClass());
    }
}
