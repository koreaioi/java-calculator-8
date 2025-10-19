package calculator.service.processor;


import org.junit.jupiter.api.Test;

import static calculator.common.message.ErrorMessage.*;
import static org.assertj.core.api.Assertions.*;

class DelimiterInspectorTest {

    private final DelimiterInspector delimiterInspector = new DelimiterInspector();

    @Test
    public void 커스텀_구분자_입력시_접두사가_없으면_예외발생() {
        String noCustomDelimiterPrefix = ":\\n1,2,3";

        assertThatThrownBy(()-> delimiterInspector.inspectDelimiter(noCustomDelimiterPrefix))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INVALID_CUSTOM_DELIMITER_PREFIX.getMessage());
    }

    @Test
    public void 커스텀_구분자_입력시_접미사가_없으면_예외발생() {
        String noCustomDelimiterSuffix = "//:1,2,3";

        assertThatThrownBy(()-> delimiterInspector.inspectDelimiter(noCustomDelimiterSuffix))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INVALID_CUSTOM_DELIMITER_SUFFIX.getMessage());
    }

    @Test
    public void 커스텀_구분자를_입력하지않으면_예외발생() {
        String customDelimiterEmpty = "//\\n1,2,3";

        assertThatThrownBy(()-> delimiterInspector.inspectDelimiter(customDelimiterEmpty))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(EMPTY_CUSTOM_DELIMITER.getMessage());
    }

    @Test
    public void 커스텀_구분자가_문자열이면_예외발생() {
        String stringCustumDelimiter = "//.;\\n1,2,3";

        assertThatThrownBy(()-> delimiterInspector.inspectDelimiter(stringCustumDelimiter))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(CUSTOM_DELIMITER_IS_STRING.getMessage());
    }

    @Test
    public void 커스텀_구분자_입력형식이_잘못되면_예외발생() {
        String stringCustumDelimiter = "\\n,//1,2,3";

        assertThatThrownBy(()-> delimiterInspector.inspectDelimiter(stringCustumDelimiter))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INVALID_CUSTOM_DELIMITER_AFFIX_ORDER.getMessage());
    }

    @Test
    public void 커스텀_구분자_입력형식이_중간에있으면_예외발생() {
        String wrongPositionCustomDelimiter = "1,2//.\\n1,2,3";

        assertThatThrownBy(()-> delimiterInspector.inspectDelimiter(wrongPositionCustomDelimiter))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(INVALID_CUSTOM_DELIMITER_POSITION.getMessage());
    }

}
