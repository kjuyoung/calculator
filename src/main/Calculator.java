import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private final Map<String, Operation> operations = new HashMap<>();

    public Calculator() {
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
    }

    public BigDecimal calculate(BigDecimal operand1, String operation, BigDecimal operand2) {
        Operation op = operations.get(operation);
        if (op == null) {
            throw new IllegalArgumentException("Unknown operation");
        }
        return op.calculate(operand1, operand2);
    }
}