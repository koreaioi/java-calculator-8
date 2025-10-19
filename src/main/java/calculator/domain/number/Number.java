package calculator.domain.number;

import java.util.function.IntBinaryOperator;

public class Number {

    private int value;

    private Number(int value) {
        // TODO -> 음수 검증 로직 추가
        this.value = value;
    }

    public static Number from(int value) {
        return new Number(value);
    }

    public static Number from(String number) {
        // TODO 문자열 -> 숫자 검증 로직 추가
        return from(Integer.parseInt(number));
    }

    public void operate(Number other, IntBinaryOperator operator) {
        this.value = operator.applyAsInt(this.value, other.value);
        // TODO 연산 결과가 Overflow 되는 EdgeCase 고려.
    }

    // TODO 결과 출력을 위해, @Override toString() 추가

}
