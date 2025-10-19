package calculator.service.processor;

import java.util.List;
import calculator.domain.number.Number;

public class InputProcessor {

    private final DelimiterManager delimiterManager;
    private final StringSplitter splitter;

    public InputProcessor(DelimiterManager delimiterManager, StringSplitter splitter) {
        this.delimiterManager = delimiterManager;
        this.splitter = splitter;
    }

    public String preprocessInput(String input) {
        if (delimiterManager.hasDelimiter(input)) {
            return delimiterManager.parseDelimiter(input);
        }
        return input;
    }

    public List<Number> splitToOperands(String preprocessedInput) {
        return splitter.splitToNumbers(preprocessedInput);
    }

}
