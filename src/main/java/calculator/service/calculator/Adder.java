package calculator.service.calculator;

import calculator.domain.number.Number;

import static calculator.common.constants.NumberConstants.ZERO;

public class Adder implements Operator{

    @Override
    public Number getInitialAccumulator() {
        return Number.from(ZERO);
    }

    @Override
    public void operate(Number accumulator, Number operand) {
        accumulator.operate(operand, Math::addExact);
    }

}
