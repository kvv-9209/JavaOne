package lesson7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int decreaseFood(int n) {

        if (n <= food) {
            food -= n;

        }
        return food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public int addFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество еды, которое хотите добавить");
        food += scanner.nextInt();
        return food;
    }
}

