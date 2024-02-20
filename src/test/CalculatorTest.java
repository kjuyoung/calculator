import arithmetic.Addition;
import arithmetic.Division;
import arithmetic.Multiplication;
import arithmetic.Subtraction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @DisplayName("덧셈 테스트")
    @Test
    void calculate_add() {

        // given
        String operand1 = "1.1";
        String operand2 = "2.2";
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
        String operand1 = "5.9";
        String operand2 = "2.4";
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
        String operand1 = "1.1";
        String operand2 = "2.4";
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
        String operand1 = "1.1";
        String operand2 = "10.0";
        Multiplication multiplication = new Multiplication();

        // when
        BigDecimal result = multiplication.calculate(operand1, operand2);

        // then
        assertEquals(result, BigDecimal.valueOf(11));
    }

    @DisplayName("결과가 나누어 떨어지는 경우, 나눗셈 테스트")
    @Test
    void calculate_division_case1() {

        // given
        String operand1 = "5.5";
        String operand2 = "1.1";
        Division division = new Division();

        // when
        BigDecimal result = division.calculate(operand1, operand2);

        // then
        assertEquals(result, BigDecimal.valueOf(5));
    }

    @DisplayName("결과가 나누어 떨어지지 않는 경우, 나눗셈 테스트")
    @Test
    void calculate_division_case2() {

        // given
        String operand1 = "10";
        String operand2 = "3";
        Division division = new Division();

        // when
        BigDecimal result = division.calculate(operand1, operand2);

        // then
        assertEquals(result, BigDecimal.valueOf(3.333333333333333));
    }

    @DisplayName("operand2가 0인 경우, 나눗셈 테스트")
    @Test
    void calculate_division_case3() {

        // given
        String operand1 = "10";
        String operand2 = "0";
        Division division = new Division();

        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> division.calculate(operand1, operand2));
    }
}