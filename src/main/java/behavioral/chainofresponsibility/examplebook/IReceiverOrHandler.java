package behavioral.chainofresponsibility.examplebook;

public interface IReceiverOrHandler {

    Boolean processMessageOrHandleRequest(Message message);
}
