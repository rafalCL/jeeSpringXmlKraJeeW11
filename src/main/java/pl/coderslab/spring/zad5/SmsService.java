package pl.coderslab.spring.zad5;

public class SmsService implements MessageService {
    @Override
    public void send(String messateText) {
        System.out.println("160 nie wiecej znakow i..., nananana: "+messateText);
    }
}
