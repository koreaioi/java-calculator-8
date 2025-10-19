package calculator.domain.delimiter;

import org.junit.jupiter.api.Test;

import static calculator.common.constants.DelimiterConstants.REGEX_BACK_SLASH;
import static calculator.common.message.ErrorMessage.CUSTOM_DELIMITER_IS_NUMBER;
import static org.assertj.core.api.Assertions.*;

class DelimiterTest {

    @Test
    public void 구분자는_숫자일_수_없다() {
        char zeroDelimiter = '0';
        char nineDelimiter = '9';

        assertThatThrownBy(() -> Delimiter.from(zeroDelimiter))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(CUSTOM_DELIMITER_IS_NUMBER.getMessage());

        assertThatThrownBy(() -> Delimiter.from(nineDelimiter))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(CUSTOM_DELIMITER_IS_NUMBER.getMessage());
    }

    @Test
    public void 구분자가_백슬래시인경우_toString_확인() {
        char backslash = '\\';
        String result = Delimiter.from(backslash).toString();

        assertThat(result).isEqualTo(REGEX_BACK_SLASH);
    }

}
