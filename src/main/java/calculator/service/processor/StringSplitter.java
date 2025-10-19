package calculator.service.processor;

import calculator.domain.delimiter.Delimiter;
import calculator.domain.delimiter.DelimiterStorage;

import java.util.stream.Collectors;

import static calculator.constants.SplitConstants.*;

public class StringSplitter {

    private final DelimiterStorage delimiterStorage;

    public StringSplitter(DelimiterStorage delimiterStorage) {
        this.delimiterStorage = delimiterStorage;
    }

    public String createSplitPattern() {
        return delimiterStorage.getAllDelimiter()
                .stream()
                .map(Delimiter::toString)
                .collect(Collectors.joining(EMPTY_STRING, SPLIT_PATTERN_PREFIX, SPLIT_PATTERN_SUFFIX));
    }

}
