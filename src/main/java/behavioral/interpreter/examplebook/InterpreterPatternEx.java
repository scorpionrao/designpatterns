package behavioral.interpreter.examplebook;

import java.util.Scanner;

/*
    Builds a terminal or non-terminal expression data structure.
    Representing a rule / sentence in language.
*/
public class InterpreterPatternEx {

    private ContextGlobalInformation clientContextGlobalInformation = null;
    private IExpressionOrRegex expression = null;

    InterpreterPatternEx(ContextGlobalInformation clientContextGlobalInformation) {
        this.clientContextGlobalInformation = clientContextGlobalInformation;
    }

    public void interpret(String str) {

        // Test
        for(int i = 0; i < 2; i++) {
            System.out.println("Enter your choice (1 or 2)");
            Scanner in = new Scanner(System.in);
            String c = in.nextLine();
            if("1".equals(c)) {
                expression = new IntToWordsTerminalExp(str);
            } else {
                expression = new StringToBinaryTerminalExp(str);
            }
            expression.interpret(clientContextGlobalInformation);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        ContextGlobalInformation contextGlobalInformation = new ContextGlobalInformation(input);
        InterpreterPatternEx client = new InterpreterPatternEx(contextGlobalInformation);
        client.interpret(input);
    }
}