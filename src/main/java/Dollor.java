public class Dollor {
    private int amount;

    Dollor(int amount) {
        this.amount = amount;
    }

    Dollor times(int multiplier) {
        return new Dollor(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        Dollor dollor = (Dollor) object;
        return amount == dollor.amount;
    }
}
