package behavioral.interpreter.examplebook;

public class StringToBinaryTerminalExp implements IExpressionOrRegex {

    private String str;

    StringToBinaryTerminalExp(String str) {
        this.str = str;
    }

    @Override
    public void interpret(ContextGlobalInformation contextGlobalInformation) {
        contextGlobalInformation.getBinaryForm();
    }
}
