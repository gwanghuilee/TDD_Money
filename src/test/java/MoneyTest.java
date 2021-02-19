import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoneyTest {
    @Test
    @DisplayName("test multiplecation")
    void testMultiplication() {
        Dollor five = new Dollor(5);
        five.times(2);
        Assertions.assertEquals(10, five.amount);
    }
}