import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @Test
    @DisplayName("test multiplication")
    void testMultiplication() {
        Dollor five = new Dollor(5);
        Assertions.assertEquals(new Dollor(10), five.times(2));
        Assertions.assertEquals(new Dollor(15), five.times(3));
    }

    @Test
    @DisplayName("test equality between dollar objects")
    void testEquality() {
        Assertions.assertEquals(new Dollor(5), new Dollor(5));
        Assertions.assertNotEquals(new Dollor(5), new Dollor(6));
    }
}
