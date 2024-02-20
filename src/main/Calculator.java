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

    public Calculator() {
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
    }

    public BigDecimal calculate(String operand1, String operation, String operand2) {

        Operation op = operations.get(operation);
        if (op == null) {
            throw new IllegalArgumentException("Unknown operation");
        }
        return op.calculate(operand1, operand2);
    }
}