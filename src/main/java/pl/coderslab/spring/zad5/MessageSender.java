package pl.coderslab.spring.zad5;

public class MessageSender {
    private String messageText;
    private MessageService service;

    public MessageSender(MessageService service, String messageText) {
        this.service = service;
        this.messageText = messageText;
    }

    public void sendMessage() {
        this.service.send(this.messageText);
    }
}
