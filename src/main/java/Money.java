public abstract class Money {
    protected int amount;

    static Dollor dollar(int amount) {
        return new Dollor(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

    abstract String currency();

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        Money money = (Money) object;
        return amount == money.amount &&
                getClass().equals(money.getClass());
    }


}
