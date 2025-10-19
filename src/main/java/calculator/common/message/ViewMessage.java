package calculator.common.message;

public enum ViewMessage {

    REQUEST_INPUT_MESSAGE("덧셈할 문자열을 입력해 주세요."),
    RESULT_FORMAT("결과 : %s");

    private final String message;

    ViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessage(String result) {
        if(this.equals(RESULT_FORMAT)){
            return String.format(this.message, result);
        }
        return this.getMessage();
    }

}
