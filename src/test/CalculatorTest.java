import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @DisplayName("덧셈 테스트")
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

    @DisplayName("Operand1 > Operand2인 경우, 뺄셈 테스트")
    @Test
    void calculate_subtraction_case1() {

        // given
        BigDecimal operand1 = BigDecimal.valueOf(5.9);
        BigDecimal operand2 = BigDecimal.valueOf(2.4);
        Subtraction subtraction = new Subtraction();

        // when
        BigDecimal result = subtraction.calculate(operand1, operand2);

        // then
        assertEquals(result, BigDecimal.valueOf(3.5));
    }

    @DisplayName("Operand1 < Operand2인 경우, 뺄셈 테스트")
    @Test
    void calculate_subtraction_case2() {

        // given
        BigDecimal operand1 = BigDecimal.valueOf(1.1);
        BigDecimal operand2 = BigDecimal.valueOf(2.4);
        Subtraction subtraction = new Subtraction();

        // when
        BigDecimal result = subtraction.calculate(operand1, operand2);

        // then
        assertEquals(result, BigDecimal.valueOf(-1.3));
    }

    @DisplayName("결과가 양수인 경우, 곱셈 테스트")
    @Test
    void calculate_multiplication_case1() {

        // given
        BigDecimal operand1 = BigDecimal.valueOf(1.1);
        BigDecimal operand2 = BigDecimal.valueOf(10.0);
        Multiplication multiplication = new Multiplication();

        // when
        BigDecimal result = multiplication.calculate(operand1, operand2);

        // then
        assertEquals(result, BigDecimal.valueOf(11));
    }

    @DisplayName("결과가 음수인 경우, 곱셈 테스트")
    @Test
    void calculate_multiplication_case2() {

        // given
        BigDecimal operand1 = BigDecimal.valueOf(-2.3);
        BigDecimal operand2 = BigDecimal.valueOf(10.1);
        Multiplication multiplication = new Multiplication();

        // when
        BigDecimal result = multiplication.calculate(operand1, operand2);

        // then
        assertEquals(result, BigDecimal.valueOf(-23.23));
    }
}