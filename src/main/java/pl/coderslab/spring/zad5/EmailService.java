package pl.coderslab.spring.zad5;

public class EmailService implements MessageService {
    @Override
    public void send(String messateText) {
        System.out.println("pędzę do Ciebie emailem, nananana: "+messateText);
    }
}
