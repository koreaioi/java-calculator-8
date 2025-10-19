package calculator.config;

import calculator.domain.delimiter.DelimiterStorage;
import calculator.service.processor.*;

public class ProcessorConfig {

    private static final ProcessorConfig INSTANCE = new ProcessorConfig();

    private ProcessorConfig() {

    }

    public static ProcessorConfig getInstance() {
        return INSTANCE;
    }

    public InputProcessor inputPreprocessor() {
        return new InputProcessor(delimiterManager(), stringSplitter());
    }

    private DelimiterManager delimiterManager() {
        return new DelimiterManager(
                delimiterInspector(), delimiterExtractor(), DelimiterStorage.getInstance()
        );
    }

    private DelimiterInspector delimiterInspector(){
        return new DelimiterInspector();
    }

    private DelimiterParser delimiterExtractor() {
        return new DelimiterParser();
    }

    private StringSplitter stringSplitter() {
        return new StringSplitter(DelimiterStorage.getInstance());
    }

}
