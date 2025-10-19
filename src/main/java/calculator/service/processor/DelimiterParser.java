package calculator.service.processor;

import calculator.domain.delimiter.Delimiter;

import static calculator.constants.DelimiterConstants.CUSTOM_DELIMITER_INDEX;
import static calculator.constants.DelimiterConstants.CUSTOM_DELIMITER_SUBTRACT_INDEX;

public class DelimiterParser {

    public Delimiter extractDelimiter(String input) {
        char symbol = input.charAt(CUSTOM_DELIMITER_INDEX);
        return Delimiter.from(symbol);
    }

    public String subtractDelimiter(String input) {
        return input.substring(CUSTOM_DELIMITER_SUBTRACT_INDEX);
    }

}
