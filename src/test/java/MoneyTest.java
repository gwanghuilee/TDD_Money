import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @Test
    @DisplayName("test multiplication")
    void testMultiplication() {
        Dollor five = new Dollor(5);
        Dollor product = five.times(2);
        Assertions.assertEquals(10, product.amount);
        product = five.times(3);
        Assertions.assertEquals(15, product.amount);
    }

    @Test
    @DisplayName("test equality between dollor objects")
    void testEquality() {
        Assertions.assertEquals(new Dollor(5), new Dollor(5));
    }
}
