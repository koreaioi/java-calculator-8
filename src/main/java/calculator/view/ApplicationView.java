package calculator.view;

public class ApplicationView {

    private final InputReader inputReader;
    private final OutputWriter outputWriter;

    public ApplicationView(InputReader inputReader, OutputWriter outputWriter) {
        this.inputReader = inputReader;
        this.outputWriter = outputWriter;
    }

    public String requestInput() {
        outputWriter.requestInput();
        return inputReader.getInput();
    }

    public void printResult(String result) {
        outputWriter.printResult(result);
    }

}
