package pl.coderslab.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {
    private String name;

    private City city;

    public HelloWorld(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void sayHi() {
        System.out.println("Hi there!");
    }

    public void greet() {
        System.out.println("Hello, " + name);
    }

    public void greetOther(String otherName) {
        System.out.println("Hello, " + otherName + ", my name is " + name);
    }

    public void greetInCity() {
        System.out.println(String.format("Hi there! I live in %s, and the boss here is %s!", this.city.getName(), this.city.getBoss()));
    }
}
