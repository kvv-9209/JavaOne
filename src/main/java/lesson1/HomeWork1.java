package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("2.");
        printThreeWords();
        System.out.println("3.");
        checkSumSign();
        System.out.println("4.");
        printColor();
        System.out.println("5.");
        compareNumbers();
    }

    public static void printThreeWords() { //задание 2: выводит слова в столбик
        System.out.println("Orange \nBanana \nApple");
    }

    public static void checkSumSign() { //задание 3: определяет положительна ли сумма
        int a = 55;
        int b = 92;
        int c = a + b;
        if (c >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }

    }

    public static void printColor() { //задание 4: задает цвет промежуткам
        int value = 102;
        if (value <= 0) {
            System.out.println("красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("желтый");
        } else {
            System.out.println("зеленый");
        }

    }

    public static void compareNumbers() { //задание 5: определяем какое число больше
        int a = 56;
        int b = 82;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
