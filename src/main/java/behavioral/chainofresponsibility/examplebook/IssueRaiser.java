package behavioral.chainofresponsibility.examplebook;

public class IssueRaiser {

    // Could be replaced by node parent in a composite object
    public IReceiverOrHandler firstReceiver;

    public IssueRaiser(IReceiverOrHandler firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    public void raiseMessage(Message message) {
        if(firstReceiver != null) {
            firstReceiver.processMessageOrHandleRequest(message);
        }
    }
}
