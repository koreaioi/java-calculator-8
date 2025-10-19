package calculator.common.config;

import calculator.controller.CalculatorApplication;

public class ApplicationConfig {

    private static final ApplicationConfig INSTANCE = new ApplicationConfig();

    private ApplicationConfig() {

    }

    public static ApplicationConfig getInstance() {
        return INSTANCE;
    }

    public CalculatorApplication calculatorApplication() {
        return new CalculatorApplication(
                viewConfig().applicationView(),
                processorConfig().inputPreprocessor(),
                calculatorConfig().calculator()
        );
    }

    private ViewConfig viewConfig() {
        return ViewConfig.getInstance();
    }

    private ProcessorConfig processorConfig() {
        return ProcessorConfig.getInstance();
    }

    private CalculatorConfig calculatorConfig() {
        return CalculatorConfig.getInstance();
    }

}
