package calculator;

import calculator.common.config.ApplicationConfig;
import calculator.controller.CalculatorApplication;

public class Application {

    public static void main(String[] args) {
        ApplicationConfig applicationConfig = ApplicationConfig.getInstance();
        CalculatorApplication calculatorApplication = applicationConfig.calculatorApplication();
        calculatorApplication.run();
    }

}
