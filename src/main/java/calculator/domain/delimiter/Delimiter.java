package calculator.domain.delimiter;

public class Delimiter {

    private final char symbol;

    private Delimiter(char symbol) {
        // TODO 구분자가 숫자인 지, 검증하는 로직 추가
        this.symbol = symbol;
    }

    public static Delimiter from(char symbol) {
        return new Delimiter(symbol);
    }

    // TODO 패턴자 생성을 위해 @Override toString

}
