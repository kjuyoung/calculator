package operation;

import java.math.BigDecimal;
import java.util.regex.Pattern;

public interface Operation {

    Pattern operandPattern = Pattern.compile("[0-9]+[.]?[0-9]*");

    BigDecimal calculate(String operand1, String operand2);

    default boolean isValidOperand(String operand) {
        return !operandPattern.matcher(operand).matches();
    }

    default boolean hasThousandSeparators(String operand) {
        return operand.contains(",");
    }
}
