package arithmetic;


import operation.Operation;

import java.math.BigDecimal;
import java.math.MathContext;

public class Division implements Operation {

    @Override
    public BigDecimal calculate(String operand1, String operand2) {

        if(hasThousandSeparators(operand1) || hasThousandSeparators(operand2)) {
            throw new IllegalArgumentException("Operands cannot contain thousand separators.");
        }

        if (isValidOperand(operand1) || isValidOperand(operand2)) {
            throw new IllegalArgumentException("Invalid operand");
        }

        if (new BigDecimal(operand2).compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return new BigDecimal(operand1).divide(new BigDecimal(operand2), MathContext.DECIMAL64)
                .stripTrailingZeros();
    }
}
