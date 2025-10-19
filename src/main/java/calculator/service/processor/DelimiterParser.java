package calculator.service.processor;

import calculator.domain.delimiter.Delimiter;

import static calculator.constants.DelimiterConstants.CUSTOM_DELIMITER_INDEX;

public class DelimiterParser {

    public Delimiter extractDelimiter(String input) {
        char symbol = input.charAt(CUSTOM_DELIMITER_INDEX);
        return Delimiter.from(symbol);
    }

}
