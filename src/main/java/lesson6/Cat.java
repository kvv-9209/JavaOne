package lesson6;

public class Cat extends Animals {
private final int DISTRUN = 200;
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void run(int distance) {
        if (distance <= DISTRUN){
        super.run(distance);
        }
        else if (distance < 0){
            System.out.println("Значение не может быть отрицательным");
        }
        else {
            System.out.println(name + " пробежал только " + (DISTRUN) + " м.");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance > 0){
            System.out.println("Коты не умеют плавать");
            //super.swim(distance);
        }
        else if (distance < 0){
            System.out.println("Значение не может быть отрицательным");
        }

    }
}
