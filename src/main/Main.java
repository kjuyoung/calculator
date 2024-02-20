import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operand1, operation (+, -, *, /), operand2 : ");
        String[] inputs = scanner.nextLine().split(" ");

        BigDecimal operand1 = new BigDecimal(inputs[0]);
        BigDecimal operand2 = new BigDecimal(inputs[2]);
        String operation = inputs[1].trim();

        BigDecimal result = calculator.calculate(operand1, operation, operand2);
        System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
    }
}
