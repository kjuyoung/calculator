package arithmetic;

import operation.Operation;

import java.math.BigDecimal;

public class Addition implements Operation {

    @Override
    public BigDecimal calculate(String operand1, String operand2) {

        if(hasThousandSeparators(operand1) || hasThousandSeparators(operand2)) {
            throw new IllegalArgumentException("Operands cannot contain thousand separators.");
        }

        if (isValidOperand(operand1) || isValidOperand(operand2)) {
            throw new IllegalArgumentException("Invalid operand");
        }

        return new BigDecimal(operand1).add(new BigDecimal(operand2));
    }
}
