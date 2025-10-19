package calculator.view;

import static calculator.common.message.ViewMessage.REQUEST_INPUT_MESSAGE;
import static calculator.common.message.ViewMessage.RESULT_FORMAT;

public class OutputWriter {

    public void requestInput() {
        System.out.println(REQUEST_INPUT_MESSAGE.getMessage());
    }

    public void printResult(String result) {
        System.out.println(RESULT_FORMAT.getMessage(result));
    }

}
