package calculator.service.processor;

import calculator.domain.delimiter.Delimiter;
import calculator.domain.delimiter.DelimiterStorage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import calculator.domain.number.Number;

public class StringSplitter {

    private final DelimiterStorage delimiterStorage;

    public StringSplitter(DelimiterStorage delimiterStorage) {
        this.delimiterStorage = delimiterStorage;
    }

    public List<Number> splitToNumbers(String preprocessedInput) {
        String pattern = createSplitPattern();
        return Arrays.stream(preprocessedInput.split(pattern))
                .map(Number::from)
                .toList();
    }

    public String createSplitPattern() {
        return delimiterStorage.getAllDelimiter()
                .stream()
                .map(Delimiter::toString)
                .collect(Collectors.joining(EMPTY_STRING, SPLIT_PATTERN_PREFIX, SPLIT_PATTERN_SUFFIX));
    }

}
