package calculator.controller;

import calculator.common.config.CalculatorConfig;
import calculator.common.config.ProcessorConfig;
import calculator.domain.number.Number;
import calculator.service.calculator.Calculator;
import calculator.service.processor.InputProcessor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

class CalculatorApplicationTest {

    ProcessorConfig processorConfig = ProcessorConfig.getInstance();
    CalculatorConfig calculatorConfig = CalculatorConfig.getInstance();

    @ParameterizedTest
    @CsvSource(value = {
            "'//.\\n1,2.3:4', 10",
            "'//\\\\n1,2\\3:4', 10",
            "'///\\n1,2/3:4', 10",
            "'// \\n1,2 3:4', 10",
            "'1,2,3:4', 10",
            "'1,,2,3:4', 10",
            "'', 0",
    })
    public void 전처리후_연산_테스트코드(String input, String expected) {
        InputProcessor inputProcessor = processorConfig.inputPreprocessor();
        Calculator calculator = calculatorConfig.calculator();

        String preprocessedInput = inputProcessor.preprocessInput(input);
        List<Number> numbers = inputProcessor.splitToOperands(preprocessedInput);
        Number result = calculator.calculate(numbers);

        assert result.equals(Number.from(expected));
    }

}
