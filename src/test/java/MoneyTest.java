import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @Test
    @DisplayName("test multiplication")
    void testMultiplication() {
        Money five = Money.dollar(5);
        Assertions.assertEquals(Money.dollar(10), five.times(2));
        Assertions.assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    @DisplayName("test equality between Money objects")
    void testEquality() {
        Assertions.assertEquals(Money.dollar(5), Money.dollar(5));
        Assertions.assertNotEquals(Money.dollar(5), Money.dollar(6));
        Assertions.assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    void testCurrency() {
        Assertions.assertEquals("USD", Money.dollar(1).currency());
        Assertions.assertEquals("CHF", Money.franc(1).currency());
    }
}
