package calculator.service.calculator;

import java.util.List;
import calculator.domain.number.Number;

public class Calculator {

    private final Operator operator;

    public Calculator(Operator operator) {
        this.operator = operator;
    }

    public Number calculate(List<Number> numbers) {
        Number accumulator = operator.getInitialAccumulator();
        for (Number operand : numbers) {
            operator.operate(accumulator, operand);
        }
        return accumulator;
    }

}
