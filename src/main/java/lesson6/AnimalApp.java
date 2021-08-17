package lesson6;

public class AnimalApp {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        Dog[] dogs = new Dog[5];

        cats[0] = new Cat("Vaska", "gray");
        cats[1] = new Cat("Boris", "white");

        dogs[0] = new Dog("Bobik", "black");
        dogs[1] = new Dog("Sharik", "grey");

        cats[0].run(150);
        cats[1].swim(50);
        dogs[0].swim(60);
        dogs[1].run(560);

        int count = 0;
        int i=0;
        for (Cat cat : cats) {
            if (cats[i] == null){
                break;
            }
            else{
                count++;
            }
            i++;
        }

        int count1 = 0;
        int j = 0;
        for (Dog dog: dogs) {
            if (dogs[j] == null){
                break;
            }
            else{
                count1++;
            }
            j++;
        }
        System.out.println("Всего котов " + count);
        System.out.println("Всего собак " + count1);
        System.out.println("Всего животных " + (count+count1));

    }

}
