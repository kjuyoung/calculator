package operation;

import arithmetic.Addition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @DisplayName("정상 결과값인 경우, IsValidOperand 메소드 테스트")
    @Test
    void IsValidOperand_true() {

        // given
        String operand1 = "123.45";
        String operand2 = "34.45";
        Addition addition = new Addition();

        // when
        BigDecimal result = addition.calculate(operand1, operand2);

        // then
        assertTrue(result.compareTo(BigDecimal.valueOf(157.9)) == 0);
    }

    @DisplayName("Exception 발생하는 경우, IsValidOperand 메소드 테스트")
    @Test
    void IsValidOperand_false() {

        // given
        String operand1 = "123.45.67";
        String operand2 = "34.45a";
        Addition addition = new Addition();

        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> addition.calculate(operand1, operand2));
    }

    @DisplayName("정상 결과값인 경우, HasThousandSeparators 메소드 테스트")
    @Test
    void HasThousandSeparators_true() {

        // given
        String operand1 = "12345";
        String operand2 = "10.11";
        Addition addition = new Addition();

        // when
        BigDecimal result = addition.calculate(operand1, operand2);

        // then
        assertTrue(result.compareTo(BigDecimal.valueOf(12355.11)) == 0);
    }

    @DisplayName("Exception 발생하는 경우, HasThousandSeparators 메소드 테스트")
    @Test
    void HasThousandSeparators_false() {

        // given
        String operand1 = "12,345";
        String operand2 = "10.11";
        Addition addition = new Addition();

        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> addition.calculate(operand1, operand2));
    }
}