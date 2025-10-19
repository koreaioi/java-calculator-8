package calculator.domain.number;

import java.util.function.IntBinaryOperator;

public class Number {

    private int value;

    private Number(int value) {
        validateNumber(value);
        this.value = value;
    }

    public static Number from(int value) {
        return new Number(value);
    }

    public static Number from(String number) {
        try{
            return number.isEmpty() ? new Number(0) : new Number(Integer.parseInt(number)); // TODO 매직 넘버 상수화
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("양의 정수(1 ~ 2,147,483,647)를 입력해주세요."); // TODO 매직 리터럴 상수화
        }
    }

    public void operate(Number other, IntBinaryOperator operator) {
        try{
            this.value = operator.applyAsInt(this.value, other.value);
        }catch(ArithmeticException e){
            throw new IllegalArgumentException("양의 정수(1 ~ 2,147,483,647)를 입력해주세요."); // TODO 매직 리터럴 상수화
        }
    }

    public void validateNumber(int value) {
        if (value < 0) { // TODO 매직 넘버 상수화
            throw new IllegalArgumentException("음수는 입력할 수 없습니다."); // TODO 매직 리터럴 상수화
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

}
