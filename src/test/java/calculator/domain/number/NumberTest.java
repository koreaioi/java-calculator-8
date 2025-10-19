package calculator.domain.number;

import org.junit.jupiter.api.Test;

import static calculator.common.message.ErrorMessage.*;
import static org.assertj.core.api.Assertions.*;

class NumberTest {

    @Test
    void 잘못된_숫자_입력시_예외_발생() {
        String invalidValue = "ㄱ";

        assertThatThrownBy(() -> Number.from(invalidValue))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(VALUE_IS_NOT_POSITIVE_INTEGER.getMessage());
    }

    @Test
    void 음수_입력시_예외_발생() {
        String invalidValue = "-1";

        assertThatThrownBy(() -> Number.from(invalidValue))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(VALUE_IS_NEGATIVE_INTEGER.getMessage());
    }

    @Test
    void 연산중_오버플로우시_예외_발생() {
        Number overflowBound = Number.from(2_147_483_647);
        Number one = Number.from(1);

        assertThatThrownBy(() -> overflowBound.operate(one, Math::addExact))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ARITHMETIC_RESULT_EXCEED_RANGE.getMessage());
    }

}
