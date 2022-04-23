package pl.coderslab.spring.zad4;

public class EmailService implements MessageService {
    @Override
    public void send() {
        System.out.println("pędzę do Ciebie emailem, nananana");
    }
}
