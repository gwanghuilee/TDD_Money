public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        Money money = (Money) object;
        return amount == money.amount;
    }
}
