import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @Test
    @DisplayName("test multiplication")
    void testDollarMultiplication() {
        Dollor five = new Dollor(5);
        Assertions.assertEquals(new Dollor(10), five.times(2));
        Assertions.assertEquals(new Dollor(15), five.times(3));
    }

    void testFrancMultiplication() {
        Franc five = new Franc(5);
        Assertions.assertEquals(new Franc(10), five.times(2));
        Assertions.assertEquals(new Franc(15), five.times(3));
    }

    @Test
    @DisplayName("test equality between Money objects")
    void testEquality() {
        Assertions.assertEquals(new Dollor(5), new Dollor(5));
        Assertions.assertNotEquals(new Dollor(5), new Dollor(6));
        Assertions.assertEquals(new Franc(5), new Franc(5));
        Assertions.assertNotEquals(new Franc(5), new Franc(6));
        Assertions.assertNotEquals(new Dollor(5), new Franc(5));
    }
}
