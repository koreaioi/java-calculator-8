package calculator.service.calculator;

import calculator.domain.number.Number;

public interface Operator {

    Number getInitialAccumulator();
    void operate(Number accumulator, Number operand);

}
