package calculator.domain.delimiter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static calculator.constants.DelimiterConstants.COLON;
import static calculator.constants.DelimiterConstants.COMMA;

public class DelimiterStorage {

    private static final DelimiterStorage INSTANCE = new DelimiterStorage();

    private final Set<Delimiter> delimiters = new HashSet<>(
            Set.of(Delimiter.from(COMMA), Delimiter.from(COLON))
    );

    private DelimiterStorage(){
    }

    public static DelimiterStorage getInstance(){
        return INSTANCE;
    }

    public void addDelimiter(Delimiter delimiter) {
        delimiters.add(delimiter);
    }

    public Set<Delimiter> getAllDelimiter() {
        return Collections.unmodifiableSet(delimiters);
    }

}
