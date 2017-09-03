package behavioral.chainofresponsibility.examplebook;

public class ChainOfResponsibilityPatternEx {
    public static void main(String[] args) {
        // making the chain
        IReceiverOrHandler faxHandler, emailHandler;
        faxHandler = new ErrorHandlers.FaxErrorHandler(null);
        emailHandler = new ErrorHandlers.EmailErrorHandler(faxHandler);

        Message message1 = new Message("Fax is reaching late to the destination");
        Message message2 = new Message("Email is not going");
        Message message3 = new Message("In Email, bcc field is disabled occasionally");
        Message message4 = new Message("Fax is not reaching destination");

        // starting point: raiser for issues
        IssueRaiser raiser = new IssueRaiser(faxHandler);

        // Can be replaced with forwarding mechanism.
        /*raiser.raiseMessage(message1);
        raiser.raiseMessage(message2);
        raiser.raiseMessage(message3);
        raiser.raiseMessage(message4);*/

        // Alternate, start from top of the chain
        emailHandler.processMessageOrHandleRequest(message1);
        emailHandler.processMessageOrHandleRequest(message2);
        emailHandler.processMessageOrHandleRequest(message3);
        emailHandler.processMessageOrHandleRequest(message4);
    }
}
