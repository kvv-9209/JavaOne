package lesson3;
import java.util.Scanner;
public class ScannerApp {
    public static void main(String[] args) {
        int integer = readNumberInRange(10,20);
        System.out.println("Your int  = " + integer);

       /*
        String word = scanner.next();
        System.out.println("Word = " + word);
        String line = scanner.nextLine();
        System.out.println("Line = " + line);*/


    }


    public static int readNumberInRange(int left, int right) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        do {
            System.out.println("Введите число от " + left + " до " + right);
            result = scanner.nextInt();
        } while (result < left || result > right);
        return result;
    }
}
