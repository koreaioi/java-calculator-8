package calculator;

import calculator.config.ApplicationConfig;
import calculator.controller.CalculatorApplication;

public class Application {

    public static void main(String[] args) {
        ApplicationConfig applicationConfig = ApplicationConfig.getInstance();
        CalculatorApplication calculatorApplication = applicationConfig.calculatorApplication();
        calculatorApplication.run();
    }

}
