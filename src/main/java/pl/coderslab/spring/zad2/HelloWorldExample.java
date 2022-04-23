package pl.coderslab.spring.zad2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("zad2.xml");
        HelloWorldZad2 hwz2 = ctx.getBean("zad2HelloWorld", HelloWorldZad2.class);
        System.out.println("Tresc propertisa message="+hwz2.getMessage());
        hwz2.printMessage();

        HelloWorldZad2 hwz3 = ctx.getBean("zad3HelloWorldBySetter", HelloWorldZad2.class);
        hwz3.printMessage();
    }
}
