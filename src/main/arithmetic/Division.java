package arithmetic;


import operation.Operation;

import java.math.BigDecimal;
import java.math.MathContext;

public class Division implements Operation {

    @Override
    public BigDecimal calculate(BigDecimal operand1, BigDecimal operand2) {

        if (operand2.compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return operand1.divide(operand2, MathContext.DECIMAL64);
    }
}
