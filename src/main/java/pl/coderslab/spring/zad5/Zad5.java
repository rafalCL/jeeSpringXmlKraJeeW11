package pl.coderslab.spring.zad5;

// Zadanie 4
//Utwórz klasę MessageSender z atrybutem typu MessageService o nazwie messageService.
//Utwórz konstruktor tej klasy ustawiający atrybut messageService jak poniżej:
//public MessageSender(MessageService messageService) {
//	this.messageService = messageService;
//}
//
//
//oraz metodę wysyłającą wiadomość jak poniżej:
//
//public void sendMessage() {
//	messageService.send();
//}
//
//Dodaj w konfiguracji xml definicję ziarna messageSender, do którego, za pomocą konstruktora, zostanie wstrzyknięty obiekt klasy EmailService.
//W metodzie main programu pobierz ziarno a następnie wywołaj na nim metodę sendMessage.

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("zad5.xml");
        MessageSender emailSender = ctx.getBean("emailSender", MessageSender.class);
        MessageSender smsSender = ctx.getBean("smsSender", MessageSender.class);
        emailSender.sendMessage();
        smsSender.sendMessage();
    }
}
