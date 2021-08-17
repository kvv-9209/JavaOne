package lesson6;

public class Animals {

    String name;
    String color;


    public Animals(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim (int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
