package calculator.common.config;

import calculator.view.ApplicationView;
import calculator.view.InputReader;
import calculator.view.OutputWriter;

public class ViewConfig {

    private static final ViewConfig INSTANCE = new ViewConfig();

    private ViewConfig() {

    }

    public static ViewConfig getInstance() {
        return INSTANCE;
    }

    public ApplicationView applicationView() {
        return new ApplicationView(inputreader(), outputwriter());
    }

    private InputReader inputreader() {
        return new InputReader();
    }

    private OutputWriter outputwriter() {
        return new OutputWriter();
    }

}
