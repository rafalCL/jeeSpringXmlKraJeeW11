package pl.coderslab.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld hw = ctx.getBean("myHelloWorld", HelloWorld.class);
        hw.sayHi();
        hw.greet();
        hw.greetOther("Karolina");
        hw.greetOther("Adam");
        HelloWorld dawidHw = ctx.getBean("dawidHello", HelloWorld.class);
        dawidHw.greet();
        dawidHw.greetInCity();

        ctx.close();
    }
}
