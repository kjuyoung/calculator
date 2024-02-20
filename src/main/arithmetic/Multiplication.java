package arithmetic;

import operation.Operation;

import java.math.BigDecimal;

public class Multiplication implements Operation {

    @Override
    public BigDecimal calculate(String operand1, String operand2) {

        if(hasThousandSeparators(operand1) || hasThousandSeparators(operand2)) {
            throw new IllegalArgumentException("Operands cannot contain thousand separators.");
        }

        if (isValidOperand(operand1) || isValidOperand(operand2)) {
            throw new IllegalArgumentException("Invalid operand");
        }

        BigDecimal result = new BigDecimal(operand1).multiply(new BigDecimal(operand2));

        if (result.stripTrailingZeros().scale() <= 0) {
            result = result.setScale(0);
        }

        return result;
    }
}
