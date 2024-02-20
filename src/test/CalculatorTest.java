import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void calculate_add() {

        // given
        BigDecimal operand1 = BigDecimal.valueOf(1.1);
        BigDecimal operand2 = BigDecimal.valueOf(2.2);
        Addition addition = new Addition();

        // when
        BigDecimal result = addition.calculate(operand1, operand2);

        // then
        assertEquals(result, BigDecimal.valueOf(3.3));
    }
}