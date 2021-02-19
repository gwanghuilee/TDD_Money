public class Franc {
    private final int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
