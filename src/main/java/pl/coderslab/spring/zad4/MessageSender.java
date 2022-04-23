package pl.coderslab.spring.zad4;

public class MessageSender {
    private MessageService service;

    public MessageSender(MessageService service) {
        this.service = service;
    }

    public void sendMessage() {
        this.service.send();
    }
}
