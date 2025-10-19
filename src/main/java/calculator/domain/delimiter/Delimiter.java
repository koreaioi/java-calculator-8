package calculator.domain.delimiter;

import static calculator.constants.DelimiterConstants.ASCII_NINE;
import static calculator.constants.DelimiterConstants.ASCII_ZERO;
import static calculator.constants.ErrorMessage.CUSTOM_DELIMITER_IS_NUMBER;

public class Delimiter {

    private final char symbol;

    private Delimiter(char symbol) {
        validateDelimiter(symbol);
        this.symbol = symbol;
    }

    public static Delimiter from(char symbol) {
        return new Delimiter(symbol);
    }

    private void validateDelimiter(char symbol) {
        if(symbol >= ASCII_ZERO && symbol <= ASCII_NINE) {
            throw new IllegalArgumentException(CUSTOM_DELIMITER_IS_NUMBER.getMessage());
        }
    }

    // TODO 패턴자 생성을 위해 @Override toString

}
