package pl.coderslab.spring;

public class City {
    private String name;
    private String boss;

    public City(String name, String boss) {
        this.name = name;
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public String getBoss() {
        return boss;
    }
}
