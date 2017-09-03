package behavioral.chainofresponsibility.examplebook;

public class ErrorHandlers {

    public static class FaxErrorHandler implements IReceiverOrHandler {

        private IReceiverOrHandler nextIReceiverOrHandler;

        public FaxErrorHandler(IReceiverOrHandler nextIReceiverOrHandler) {
            this.nextIReceiverOrHandler = nextIReceiverOrHandler;
        }

        @Override
        public Boolean processMessageOrHandleRequest(Message message) {
            if(message.text.contains("Fax")) {
                System.out.println("FaxErrorHandler processed - " + message.text);
                return true;
            } else {
                if(nextIReceiverOrHandler != null) {
                    nextIReceiverOrHandler.processMessageOrHandleRequest(message);
                }
            }
            return false;
        }
    }

    public static class EmailErrorHandler implements IReceiverOrHandler {

        private IReceiverOrHandler nextIReceiverOrHandler;

        public EmailErrorHandler(IReceiverOrHandler nextIReceiverOrHandler) {
            this.nextIReceiverOrHandler = nextIReceiverOrHandler;
        }

        @Override
        public Boolean processMessageOrHandleRequest(Message message) {
            if(message.text.contains("Email")) {
                System.out.println("EmailErrorHandler processed - " + message.text);
                return true;
            } else {
                if(nextIReceiverOrHandler != null) {
                    nextIReceiverOrHandler.processMessageOrHandleRequest(message);
                }
            }
            return false;
        }
    }
}
