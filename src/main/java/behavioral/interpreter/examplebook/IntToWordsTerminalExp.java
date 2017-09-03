package behavioral.interpreter.examplebook;

public class IntToWordsTerminalExp implements IExpressionOrRegex {

    private String str;

    IntToWordsTerminalExp(String str) {
        this.str = str;
    }

    @Override
    public void interpret(ContextGlobalInformation contextGlobalInformation) {
        contextGlobalInformation.printInWords();
    }
}
