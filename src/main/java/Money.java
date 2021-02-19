public abstract class Money {
    protected int amount;

    static Dollor dollar(int amount) {
        return new Dollor(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        Money money = (Money) object;
        return amount == money.amount &&
                getClass().equals(money.getClass());
    }
}
