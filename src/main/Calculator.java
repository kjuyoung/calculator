import arithmetic.Addition;
import arithmetic.Division;
import arithmetic.Multiplication;
import arithmetic.Subtraction;
import operation.Operation;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Calculator {

    private final Map<String, Operation> operations = new HashMap<>();
    private final Pattern operandPattern = Pattern.compile("[0-9]+[.]?[0-9]*");

    public Calculator() {
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
    }

    public boolean isValidOperand(String operand) {
        return !operandPattern.matcher(operand).matches();
    }

    public BigDecimal calculate(BigDecimal operand1, String operation, BigDecimal operand2) {

        if (isValidOperand(operand1.toPlainString()) || isValidOperand(operand2.toPlainString())) {
            throw new IllegalArgumentException("Invalid operand");
        }

        Operation op = operations.get(operation);
        if (op == null) {
            throw new IllegalArgumentException("Unknown operation");
        }
        return op.calculate(operand1, operand2);
    }
}