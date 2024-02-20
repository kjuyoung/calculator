package arithmetic;

import operation.Operation;

import java.math.BigDecimal;

public class Addition implements Operation {

    @Override
    public BigDecimal calculate(BigDecimal operand1, BigDecimal operand2) {
        return operand1.add(operand2);
    }
}
