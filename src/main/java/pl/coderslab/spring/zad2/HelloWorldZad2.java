package pl.coderslab.spring.zad2;

public class HelloWorldZad2 {
    private String message;

    public HelloWorldZad2(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Your Message : " + message);
    }
}
