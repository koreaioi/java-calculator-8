package calculator.common.config;

import calculator.service.calculator.Adder;
import calculator.service.calculator.Calculator;
import calculator.service.calculator.Operator;

public class CalculatorConfig {

    private static final CalculatorConfig INSTANCE = new CalculatorConfig();

    private CalculatorConfig() {

    }

    public static CalculatorConfig getInstance() {
        return INSTANCE;
    }

    public Calculator calculator() {
        return new Calculator(operator());
    }

    private Operator operator() {
        return new Adder();
    }

}
