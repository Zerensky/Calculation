import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testCalculateDiscount_validArguments() {
        double result = calculator.calculateDiscount(1000, 20);
        assertThat(result).isEqualTo(800);
    }

    @Test
    public void testCalculateDiscount_zeroDiscount() {
        double result = calculator.calculateDiscount(1000, 0);
        assertThat(result).isEqualTo(1000);
    }

    @Test
    public void testCalculateDiscount_fullDiscount() {
        double result = calculator.calculateDiscount(1000, 100);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testCalculateDiscount_negativePurchaseAmount() {
        assertThatExceptionOfType(ArithmeticException.class)
            .isThrownBy(() -> calculator.calculateDiscount(-1000, 20))
            .withMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscount_negativeDiscountPercentage() {
        assertThatExceptionOfType(ArithmeticException.class)
            .isThrownBy(() -> calculator.calculateDiscount(1000, -20))
            .withMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscount_discountPercentageAbove100() {
        assertThatExceptionOfType(ArithmeticException.class)
            .isThrownBy(() -> calculator.calculateDiscount(1000, 120))
            .withMessage("Invalid arguments");
    }
}

