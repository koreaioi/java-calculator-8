package calculator.view;

import static calculator.constants.ViewMessage.REQUEST_INPUT_MESSAGE;

public class OutputWriter {

    public void requestInput() {
        System.out.println(REQUEST_INPUT_MESSAGE.getMessage());
    }

}
