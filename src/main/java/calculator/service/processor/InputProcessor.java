package calculator.service.processor;

public class InputProcessor {

    private final DelimiterManager delimiterManager;

    public InputProcessor(DelimiterManager delimiterManager) {
        this.delimiterManager = delimiterManager;
    }

    public String preprocessInput(String input) {
        if (delimiterManager.hasDelimiter(input)) {
            return delimiterManager.parseDelimiter(input);
        }
        return input;
    }

}
