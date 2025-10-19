package calculator.service.calculator;

public interface Operator {

    Number getInitialAccumulator();
    void operate(Number accumulator, Number operand);

}
