package calculator.domain.number;

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

    // TODO 결과 출력을 위해, @Override toString() 추가

}
