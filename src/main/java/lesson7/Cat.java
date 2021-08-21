package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            satiety = false;
        }
        else if (satiety == false) {
            p.decreaseFood(appetite);
            satiety = true;
        }

    }

    public boolean isSatiety() {
        return satiety;
    }

    public void infoSatiety() {
        if (satiety == false) {
            System.out.println("Кот " + name + " голоден");
        } else {
            System.out.println("Кот " + name + " сыт");
        }
    }

}

