package behavioral.interpreter.examplebook;

public class ContextGlobalInformation {

    private String input;
    public ContextGlobalInformation(String input) {
        this.input = input;
    }

    public void getBinaryForm() {
        int i = Integer.parseInt(input);
        // Integer to its equivalent binary string representation
        String binaryString = Integer.toBinaryString(i);
        System.out.println("Binary equivalent of " + input + " is " + binaryString);
    }

    public void printInWords() {
        char[] charArray = input.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                case '0':
                    System.out.print("Zero ");
                    break;
                default:
                    System.out.println("* ");
                    break;
            }
        }
        System.out.println();
    }
}
