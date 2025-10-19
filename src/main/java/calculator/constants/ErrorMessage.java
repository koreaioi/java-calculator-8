package calculator.constants;

public enum ErrorMessage {

    VALUE_IS_NOT_POSITIVE_INTEGER("양의 정수(1 ~ 2,147,483,647)를 입력해주세요."),
    VALUE_IS_NEGATIVE_INTEGER("음수는 입력할 수 없습니다."),
    ARITHMETIC_RESULT_EXCEED_RANGE("연산 결과가 표현 가능한 범위를 벗어났습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
