package lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Vaska", 20, false);
        cat[1] = new Cat("Boris", 10, false);
        cat[2] = new Cat("Barsik", 125, false);
        cat[3] = new Cat("Muska", 25, false);
        cat[4] = new Cat("Kuzya", 45, false);

        Plate plate = new Plate(100);
        plate.info();
        for(int i = 0; i< cat.length; i++) {
            cat[i].eat(plate);
            cat[i].infoSatiety();
            plate.info();
            if (cat[i].isSatiety()==false){
                plate.addFood();
                cat[i].eat(plate);
                cat[i].infoSatiety();
                plate.info();
            }
        }
    }
}
