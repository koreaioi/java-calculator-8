package calculator.service.calculator;

import calculator.domain.number.Number;

public class Adder implements Operator{

    @Override
    public Number getInitialAccumulator() {
        return Number.from(0); // TODO 매직넘버 수정
    }

    @Override
    public void operate(Number accumulator, Number operand) {
        accumulator.operate(operand);
    }

}
