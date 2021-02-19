public class Dollor extends Money {
    Dollor(int amount) {
        this.amount = amount;
    }

    Dollor times(int multiplier) {
        return new Dollor(this.amount * multiplier);
    }
}
