package pl.coderslab.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld hw = ctx.getBean("myHelloWorld", HelloWorld.class);
        hw.sayHi();


        ctx.close();
    }
}
