import java.math.BigDecimal;

public class Multiplication implements Operation{

    @Override
    public BigDecimal calculate(BigDecimal operand1, BigDecimal operand2) {
        BigDecimal result = operand1.multiply(operand2);

        if (result.stripTrailingZeros().scale() <= 0) {
            result = result.setScale(0);
        }

        return result;
    }
}
