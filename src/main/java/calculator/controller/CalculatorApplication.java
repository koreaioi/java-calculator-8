package calculator.controller;

import calculator.domain.number.Number;
import calculator.service.calculator.Calculator;
import calculator.service.processor.InputProcessor;
import calculator.view.ApplicationView;

import java.util.List;

public class CalculatorApplication {

    private final ApplicationView view;
    private final InputProcessor inputProcessor;
    private final Calculator calculator; // 추상화

    public CalculatorApplication(ApplicationView view, InputProcessor inputProcessor, Calculator calculator) {
        this.view = view;
        this.inputProcessor = inputProcessor;
        this.calculator = calculator;
    }

    public Number execute(String input) {
        String preprocessedInput = inputProcessor.preprocessInput(input);
        List<Number> allOperand = inputProcessor.splitToOperands(preprocessedInput);
        return calculator.calculate(allOperand);
    }

}
