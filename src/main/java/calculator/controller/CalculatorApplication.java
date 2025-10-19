package calculator.controller;

import calculator.service.calculator.Calculator;
import calculator.service.processor.InputProcessor;
import calculator.view.ApplicationView;

public class CalculatorApplication {

    private final ApplicationView view;
    private final InputProcessor inputProcessor;
    private final Calculator calculator; // 추상화

    public CalculatorApplication(ApplicationView view, InputProcessor inputProcessor, Calculator calculator) {
        this.view = view;
        this.inputProcessor = inputProcessor;
        this.calculator = calculator;
    }

}
