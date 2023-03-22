package animals;

public class GoldFish {

    private String name;
    private int age;

    public int calculateAgeInHumanYears() {
        return age * 7;
    }
    public GoldFish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String speak() {
        return "";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
