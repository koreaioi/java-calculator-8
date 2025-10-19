package calculator.view;

import static calculator.constants.ViewMessage.REQUEST_INPUT_MESSAGE;
import static calculator.constants.ViewMessage.RESULT_FORMAT;

public class OutputWriter {

    public void requestInput() {
        System.out.println(REQUEST_INPUT_MESSAGE.getMessage());
    }

    public void printResult(String result) {
        System.out.println(RESULT_FORMAT.getMessage(result));
    }

}
