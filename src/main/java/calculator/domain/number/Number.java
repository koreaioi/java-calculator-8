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
        try{
            this.value = operator.applyAsInt(this.value, other.value);
        }catch(ArithmeticException e){
            throw new IllegalArgumentException("양의 정수(1 ~ 2,147,483,647)를 입력해주세요."); // TODO 매직 리터럴 상수화 고려
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

}
