package lesson6;

public class Dog extends Animals {
    private final int DISTRUN = 500;
    private final int DISTSWIM = 20;

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void run(int distance) {
        if (distance <= DISTRUN) {
            super.run(distance);
        } else if (distance < 0) {
            System.out.println("Значение не может быть отрицательным");
        } else {
            System.out.println(name + " пробежал только " + DISTRUN + " м.");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance <= DISTSWIM) {
            super.swim(distance);
        } else if (distance < 0) {
            System.out.println("Значение не может быть отрицательным");
        } else {
            System.out.println(name + " проплыл только " + DISTSWIM + " м.");
        }
    }
}
