package calculator.service.calculator;

import calculator.config.CalculatorConfig;
import calculator.domain.number.Number;
import org.junit.jupiter.api.Test;

import java.util.List;

class CalculatorTest {

    private final Calculator calculator;

    public CalculatorTest() {
        CalculatorConfig instance = CalculatorConfig.getInstance();
        this.calculator = instance.calculator();
    }

    @Test
    void 기초_덧셈연산_테스트() {
        List<Number> testNumbers = List.of(
                Number.from(0),
                Number.from(2),
                Number.from(4),
                Number.from(6)
        );

        Number result = calculator.calculate(testNumbers);
        assert result.equals(Number.from(12));
    }

}