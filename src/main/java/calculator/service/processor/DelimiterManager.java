package calculator.service.processor;

import calculator.domain.delimiter.DelimiterStorage;

public class DelimiterManager{

    private final DelimiterInspector inspector;
    private final DelimiterParser parser;
    private final DelimiterStorage storage;

    public DelimiterManager(DelimiterInspector inspector, DelimiterParser parser, DelimiterStorage storage) {
        this.inspector = inspector;
        this.parser = parser;
        this.storage = storage;
    }

    public boolean hasDelimiter(String input) {
        return inspector.inspectDelimiter(input);
    }

}
