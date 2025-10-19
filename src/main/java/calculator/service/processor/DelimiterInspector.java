package calculator.service.processor;

import static calculator.common.constants.DelimiterConstants.*;
import static calculator.common.message.ErrorMessage.*;

public class DelimiterInspector {

    public boolean inspectDelimiter(String input) {
        int prefixIndex = input.indexOf(CUSTOM_DELIMITER_PREFIX);
        int suffixIndex = input.indexOf(CUSTOM_DELIMITER_SUFFIX);
        if (checkDelimiter(prefixIndex, suffixIndex)) {
            return true;
        }
        validateDelimiterFormat(prefixIndex, suffixIndex);
        return false;
    }

    private boolean checkDelimiter(int prefixIndex, int suffixIndex) {
        return prefixIndex == CUSTOM_DELIMITER_PREFIX_INDEX && suffixIndex == CUSTOM_DELIMITER_SUFFIX_INDEX;
    }

    private void validateDelimiterFormat(int prefixIndex, int suffixIndex) {
        validateDelimiterPrefix(prefixIndex, suffixIndex);
        validateDelimiterSuffix(prefixIndex, suffixIndex);
        validateDelimiterValue(prefixIndex, suffixIndex);
        validateDelimiterLength(prefixIndex, suffixIndex);
        validateDelimiterAffixOrder(prefixIndex, suffixIndex);
        validateDelimiterFormatPosition(prefixIndex, suffixIndex);
    }

    private void validateDelimiterPrefix(int prefixIndex, int suffixIndex) {
        if(prefixIndex == NOT_FOUND && suffixIndex != NOT_FOUND){
            throw new IllegalArgumentException(INVALID_CUSTOM_DELIMITER_PREFIX.getMessage());
        }
    }

    private void validateDelimiterSuffix(int prefixIndex, int suffixIndex) {
        if(prefixIndex != NOT_FOUND && suffixIndex == NOT_FOUND){
            throw new IllegalArgumentException(INVALID_CUSTOM_DELIMITER_SUFFIX.getMessage());
        }
    }

    private void validateDelimiterValue(int prefixIndex, int suffixIndex) {
        if (prefixIndex == CUSTOM_DELIMITER_PREFIX_INDEX && suffixIndex == CUSTOM_DELIMITER_INDEX) {
            throw new IllegalArgumentException(EMPTY_CUSTOM_DELIMITER.getMessage());
        }
    }

    private void validateDelimiterLength(int prefixIndex, int suffixIndex) {
        if (prefixIndex == CUSTOM_DELIMITER_PREFIX_INDEX && suffixIndex > CUSTOM_DELIMITER_SUFFIX_INDEX) {
            throw new IllegalArgumentException(CUSTOM_DELIMITER_IS_STRING.getMessage());
        }
    }

    private void validateDelimiterAffixOrder(int prefixIndex, int suffixIndex) {
        if(prefixIndex > suffixIndex) {
            throw new IllegalArgumentException(INVALID_CUSTOM_DELIMITER_AFFIX_ORDER.getMessage());
        }
    }

    private void validateDelimiterFormatPosition(int prefixIndex, int suffixIndex) {
        if(prefixIndex > CUSTOM_DELIMITER_PREFIX_INDEX && suffixIndex > CUSTOM_DELIMITER_SUFFIX_INDEX) {
            throw new IllegalArgumentException(INVALID_CUSTOM_DELIMITER_POSITION.getMessage());
        }
    }

}
